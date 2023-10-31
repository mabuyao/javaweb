package com.xiaoma.qqzone.service.impl;

import com.xiaoma.qqzone.dao.UserBasicDAO;
import com.xiaoma.qqzone.pojo.UserBasic;
import com.xiaoma.qqzone.service.UserBasicServices;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UserBasicServiceImpl
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 14:43
 * @Version 1.0
 */
public class UserBasicServiceImpl implements UserBasicServices {
    private UserBasicDAO userBasicDAO = null;
    @Override
    public UserBasic login(String loginId, String pwd) {
        UserBasic userBasic = userBasicDAO.getUserBasic(loginId,pwd);
        return userBasic;
    }

    @Override
    public List<UserBasic> getFriendList(UserBasic userBasic) {
        List<UserBasic> userBasicList = userBasicDAO.getUserBasicList(userBasic);
        List<UserBasic> friendList = new ArrayList<>(userBasicList.size());
        for (int i = 0; i < userBasicList.size(); i++) {
            UserBasic friend = userBasicList.get(i);
            friend = userBasicDAO.getUserBasicById(friend.getId());
            friendList.add(friend);
        }
        return friendList;
    }
}
