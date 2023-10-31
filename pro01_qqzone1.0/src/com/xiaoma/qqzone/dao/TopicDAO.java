package com.xiaoma.qqzone.dao;

import com.xiaoma.qqzone.pojo.Topic;
import com.xiaoma.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * ClassName: TopicDAO
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 11:30
 * @Version 1.0
 */
public interface TopicDAO {
    //获取制定用户的日志列表
    public List<Topic> getTopicList(UserBasic userBasic);
    //添加日志
    public void addTopic(Topic topic);
    //删除日志
    public void delTopic(Topic topic);
    //获取特定日志信息
    public Topic getTopic(Integer id);
}
