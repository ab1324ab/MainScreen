package com.myigou.realize;

import com.myigou.dao.Pm_content_picsDao;
import com.myigou.nitiy.Pm_content;

import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public class Pm_contentDaoImp extends PublicInherit {
    /**
     * 查询全部
     * @param map
     * @return
     */
   public static List<Pm_content> selectContent(Map map){
      return pm_contentDao.selectContent(map);
   }
    /**
     *总数
     * @return
     */
    public static Integer maxContent(){
       return pm_contentDao.maxContent();
    }
}
