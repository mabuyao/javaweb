package com.xiaoma.qqzone.service.impl;

import com.xiaoma.qqzone.dao.TopicDAO;
import com.xiaoma.qqzone.pojo.Topic;
import com.xiaoma.qqzone.pojo.UserBasic;
import com.xiaoma.qqzone.service.TopicService;

import java.util.List;

/**
 * ClassName: TopicServiceImpl
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 14:58
 * @Version 1.0
 */
public class TopicServiceImpl implements TopicService {
    private TopicDAO topicDAO = null;
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }
}
