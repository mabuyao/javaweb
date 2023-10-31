package com.xiaoma.qqzone.controller;

import com.xiaoma.qqzone.pojo.Topic;
import com.xiaoma.qqzone.pojo.UserBasic;
import com.xiaoma.qqzone.service.TopicService;
import com.xiaoma.qqzone.service.UserBasicServices;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * ClassName: UserController
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 15:11
 * @Version 1.0
 */
public class UserController {
    private UserBasicServices userBasicServices;
    private TopicService topicService;
    public String login(String loginId, String pwd, HttpSession session){
        //1.登录验证
        UserBasic userBasic = userBasicServices.login(loginId, pwd);
        if(userBasic!=null){
            List<UserBasic> friendList = userBasicServices.getFriendList(userBasic);
            List<Topic> topicList = topicService.getTopicList(userBasic);

            userBasic.setFriendList(friendList);
            userBasic.setTopicList(topicList);

            session.setAttribute("userBasic",userBasic);
            return "index";
        }else {
            return "login";
        }

    }
}
