package com.myigou.dao;

import com.myigou.nitiy.Pm_content_pics;
import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public interface Pm_content_picsDao {
    List<Pm_content_pics> selectPic(Map map);
    Integer maxPic();
}
