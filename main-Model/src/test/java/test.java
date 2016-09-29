import com.myigou.dao.MessageLeiDao;
import com.myigou.nitiy.MessageLei;
import com.myigou.nitiy.Pm_category;
import com.myigou.nitiy.Pm_content;
import com.myigou.nitiy.Pm_content_pics;
import com.myigou.realize.MessageLeiDaoImp;
import com.myigou.realize.Pm_categoryDaoImp;
import com.myigou.realize.Pm_contentDaoImp;
import com.myigou.realize.Pm_content_picsDaoImp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public class test {
    SqlSession sqlSession;
    MessageLeiDao messageLeiDao;
    @Before
    public void common(){
        Reader reader= null;
        try {
            reader = Resources.getResourceAsReader("gju.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory gongchang= new SqlSessionFactoryBuilder().build(reader);
        sqlSession=gongchang.openSession();
        System.out.println(sqlSession);//测试是否有连接
        messageLeiDao=sqlSession.getMapper(MessageLeiDao.class);

    }
    @Test
    public void add1(){
         Map map=new HashMap();
        map.put("min",0);
        map.put("max",3);
        MessageLei messageLei=new MessageLei();
        messageLei.setMessageid(UUID.randomUUID().toString());
        messageLei.setMessagename("你好");
        messageLei.setThemessageip("sssss");
        messageLei.setMessagecontent("zheshi大家");
        int string= messageLeiDao.insertThe(messageLei);
        System.out.println(string);
        sqlSession.commit();
    }
    @Test
    public void add2(){
        MessageLei messageLei=new MessageLei();
        messageLei.setThemessageip("dddd");
        messageLei.setMessageid(UUID.randomUUID().toString());
        System.out.println(MessageLeiDaoImp.insertThes(messageLei));

    }
    @Test
    public void add3(){
        Map map=new HashMap();
        map.put("min",0);
        map.put("max",2);
        List<MessageLei> leis=MessageLeiDaoImp.selectAlls(map);
        for (MessageLei k:leis) {
            System.out.println(k.getMessagename());
        }
        System.out.println(MessageLeiDaoImp.allcounts());
    }
    @Test
    public void add4(){
        System.out.println(Pm_categoryDaoImp.maxPm_category());
        Map map=new HashMap();
        map.put("min",0);
        map.put("max",2);
        List<Pm_category>list=Pm_categoryDaoImp.selectPm_category(map);
        for (Pm_category l:list) {
            System.out.println(l.getPmPicSmallUrl()+"\n"+l.getPmPicBigUrl());
        }
    }
    @Test
    public void add5(){
        System.out.println(Pm_content_picsDaoImp.maxPics());
        Map map=new HashMap();
        map.put("min",0);
        map.put("max",2);
         List<Pm_content_pics>list=Pm_content_picsDaoImp.selectPics(map);
        for (Pm_content_pics l:list) {
            System.out.println(l.getPmPicUrl()+"\n"+l.getPmRelateUrl());
        }
    }
    @Test
    public void add7(){
        System.out.println(Pm_contentDaoImp.maxContent());
        Map map=new HashMap();
        map.put("min",0);
        map.put("max",2);
       List<Pm_content>list=Pm_contentDaoImp.selectContent(map);
        for (Pm_content l:list) {
            System.out.println(l.getPmPicBigUrl());
        }
    }
    @Test
    public void add8(){

    }
    @Test
    public void add9(){

    }
    @Test
    public void add10(){

    }
    @Test
    public void add11(){

    }
    @Test
    public void add12(){

    }
    @Test
    public void add13(){

    }
    @Test
    public void add14(){

    }
    @Test
    public void add15(){

    }
    @Test
    public void add16(){

    }
    @Test
    public void add17(){

    }
    @Test
    public void add18(){

    }
}
