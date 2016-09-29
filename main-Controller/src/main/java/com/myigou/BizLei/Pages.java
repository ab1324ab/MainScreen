package com.myigou.BizLei;

import com.myigou.realize.MessageLeiDaoImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/17.
 */
public class Pages {
    private static int f = 1;
    private static int allcounts = MessageLeiDaoImp.allcounts();

    public static Integer page() {
        int i = allcounts;
        //System.out.println(i);
        i = i - 2;
        //System.out.println(i);
        if (i % 3 == 0)
            return i / 3;
        else
            return i / 3 + 1;
    }

    public static Integer xianshi(int i) {
        int oli = 0;
        List<Integer> list = new ArrayList<Integer>();
        int ou = 1;
        for (int is = 0; ou < allcounts - 2; is++) {
            list.add(is, ou);
            ou += 2;
        }
        oli = i + list.get(i - 1);
        //if (i>=page()){i=page();}
        System.out.println(oli + ";" + "i=" + i + ";" + list.toString());
        return oli;
    }
}
