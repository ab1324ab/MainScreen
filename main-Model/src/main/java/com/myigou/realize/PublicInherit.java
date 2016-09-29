package com.myigou.realize;

import com.myigou.dao.MessageLeiDao;
import com.myigou.dao.Pm_categoryDao;
import com.myigou.dao.Pm_contentDao;
import com.myigou.dao.Pm_content_picsDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public class PublicInherit {
    protected static MessageLeiDao messageLeiDao;
    protected static SqlSession sqlSession;
    protected static Reader reader;
    protected static Pm_categoryDao pm_categoryDao;
    protected static Pm_content_picsDao pm_content_picsDao;
    protected static Pm_contentDao pm_contentDao;
    /**
     * 静态方法
     */
    static {
        try {
            reader = Resources.getResourceAsReader("gju.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory gongchang= new SqlSessionFactoryBuilder().build(reader);
        sqlSession=gongchang.openSession();
         messageLeiDao=sqlSession.getMapper(MessageLeiDao.class);
         pm_categoryDao=sqlSession.getMapper(Pm_categoryDao.class);
         pm_content_picsDao=sqlSession.getMapper(Pm_content_picsDao.class);
         pm_contentDao=sqlSession.getMapper(Pm_contentDao.class);
    }
    /**
     * 提交的方法
     */
    public static void commitl(){
        sqlSession.commit();
    }
    /**
     * 回滚的方法
     */
    public static void rollbackl(){
        sqlSession.rollback();
    }
}
