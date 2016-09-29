import com.myigou.BizLei.Pages;
import com.myigou.nitiy.MessageLei;
import com.myigou.realize.MessageLeiDaoImp;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public class test {

    @Before
    public void common(){

    }
    @Test
    public void add1(){
        System.out.println(Pages.page());
    }
    @Test
    public void add2(){
        Map map=new HashMap();
        map.put("min",Pages.xianshi(4));
        map.put("max",3);
        List<MessageLei> mess=MessageLeiDaoImp.selectAlls(map);
        for (MessageLei lk:mess) {
            System.out.println(lk.getMessagecontent()+":"+lk.getMessagetime());
        }
    }
    @Test
    public void add3(){

    }
    @Test
    public void add4(){

    }
    @Test
    public void add5(){

    }
    @Test
    public void add6(){

    }
}
