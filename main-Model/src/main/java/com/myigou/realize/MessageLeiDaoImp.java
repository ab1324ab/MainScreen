package com.myigou.realize;


import com.myigou.dao.MessageLeiDao;
import com.myigou.nitiy.MessageLei;

import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public class MessageLeiDaoImp extends PublicInherit{
    /**
     * 增加的方法
     * @param messageLei
     * @return
     */
    public static Integer insertThes(MessageLei messageLei){
        Integer i=0;
        try {
            i=messageLeiDao.insertThe(messageLei);
            commitl();
            return i;
        }catch (Exception ex){
            ex.printStackTrace();
            rollbackl();
            return 0;
        }
    }

    /**
     * 删除的方法
     * @param messageid
     * @return
     */
    public static Integer delupdates(String messageid){
        Integer integer=null;
        try {
            integer= messageLeiDao.delupdate(messageid);
            commitl();
        }catch (Exception ex){
            ex.printStackTrace();
            rollbackl();
            return null;
        }
        return integer;
    }

    /**
     * 查询方法
     * @param map
     * @return
     */
    public static List<MessageLei> selectAlls(Map map){
        return messageLeiDao.selectAll(map);
    }
    /**
     * z总数
     * @return
     */
    public static Integer allcounts(){
        return messageLeiDao.allCount();
    }
}
