package com.myigou.dao;

import com.myigou.nitiy.MessageLei;

import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public interface MessageLeiDao {
    Integer delupdate(String messageid);
    List<MessageLei> selectAll(Map map);
    Integer insertThe(MessageLei messageLei);
    Integer allCount();
}
