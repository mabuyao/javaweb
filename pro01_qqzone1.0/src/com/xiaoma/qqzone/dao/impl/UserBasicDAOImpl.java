package com.xiaoma.qqzone.dao.impl;

import com.xiaoma.myssm.basedao.BaseDAO;
import com.xiaoma.qqzone.dao.UserBasicDAO;
import com.xiaoma.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * ClassName: UserBasicDAOImpl
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 11:39
 * @Version 1.0
 */
public class UserBasicDAOImpl extends BaseDAO<UserBasic> implements UserBasicDAO {

    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        return super.load("select * from t_user_basic where loginId = ? and pwd = ?", loginId, pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql = "select fid as `id` from t_friend where uid = ?";
        return super.executeQuery(sql,userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicById(Integer id) {
        return load("select * from t_user_basic where id = ?" , id);
    }
}
