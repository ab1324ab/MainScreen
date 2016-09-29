package com.myigou.dao;

import com.myigou.nitiy.Pm_content;

import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public interface Pm_contentDao {
    List<Pm_content> selectContent(Map map);
    Integer maxContent();
}
