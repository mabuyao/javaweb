package com.xiaoma.qqzone.dao.impl;

import com.xiaoma.myssm.basedao.BaseDAO;
import com.xiaoma.qqzone.dao.TopicDAO;
import com.xiaoma.qqzone.pojo.Topic;
import com.xiaoma.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * ClassName: TopicDAOOmpl
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 14:33
 * @Version 1.0
 */
public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.executeQuery("select * from t_topic where author = ?", userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {

    }

    @Override
    public void delTopic(Topic topic) {

    }

    @Override
    public Topic getTopic(Integer id) {
        return null;
    }
}
