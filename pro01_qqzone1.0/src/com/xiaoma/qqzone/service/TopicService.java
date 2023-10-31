package com.xiaoma.qqzone.service;

import com.xiaoma.qqzone.pojo.Topic;
import com.xiaoma.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * ClassName: TopicService
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 14:56
 * @Version 1.0
 */
public interface TopicService {
    //查询特定用户的日志列表
    List<Topic> getTopicList(UserBasic userBasic);
}
