package com.xiaoma.qqzone.service;

import com.xiaoma.qqzone.dao.UserBasicDAO;
import com.xiaoma.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * ClassName: UserBasicServices
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 14:41
 * @Version 1.0
 */
public interface UserBasicServices {
    public UserBasic login(String loginId, String pwd);
    public List<UserBasic> getFriendList(UserBasic userBasic);
}
