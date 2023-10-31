package com.xiaoma.qqzone.dao;

import com.xiaoma.qqzone.pojo.UserBasic;
import com.xiaoma.qqzone.service.UserBasicServices;

import java.util.List;

/**
 * ClassName: UserBasicDAO
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 11:28
 * @Version 1.0
 */
public interface UserBasicDAO {
    //根据账号和密码获取特定用户信息
    public UserBasic getUserBasic(String loginId,String pwd);
    //获取制定用户的所有好友列表
    public List<UserBasic> getUserBasicList(UserBasic userBasic);
    //根据id查询UserBasic的信息
    UserBasic getUserBasicById(Integer id);
}
