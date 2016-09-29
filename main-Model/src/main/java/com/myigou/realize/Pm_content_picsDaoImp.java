package com.myigou.realize;

import com.myigou.nitiy.Pm_content_pics;

import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public class Pm_content_picsDaoImp extends PublicInherit{
    /**
     * 数据库的数据总数
     * @return
     */
    public static Integer maxPics(){
        return pm_content_picsDao.maxPic();
    }

    /**
     * 返回数据集合
     * @param map
     * @return
     */
    public static List<Pm_content_pics> selectPics(Map map){
        return pm_content_picsDao.selectPic(map);
    }
}
