package com.xiaoma.qqzone.dao;

import com.xiaoma.qqzone.pojo.Reply;
import com.xiaoma.qqzone.pojo.Topic;

import java.util.List;

/**
 * ClassName: ReplyDAO
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/30 11:33
 * @Version 1.0
 */
public interface ReplyDAO {
    //获取指定日志的回复列表
    public List<Reply> getReplyList(Topic topic);
    //添加回复
    public void addReply(Reply reply);
    //删除回复
    public void delReply(Integer id);
}
