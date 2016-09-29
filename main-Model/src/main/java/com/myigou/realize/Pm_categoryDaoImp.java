package com.myigou.realize;

import com.myigou.nitiy.Pm_category;

import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public class Pm_categoryDaoImp extends PublicInherit{
    private static Integer ih=0;
    /**
     * 查询全部
     * @param map
     * @return
     */
    public static List<Pm_category> selectPm_category(Map map){
        return pm_categoryDao.selectPm_category(map);
    }
    /**
     * 总数
     * @return
     */
    public static Integer maxPm_category(){
        Integer integer=pm_categoryDao.maxPm_category();
         ih=integer;
        return ih;
    }

}
