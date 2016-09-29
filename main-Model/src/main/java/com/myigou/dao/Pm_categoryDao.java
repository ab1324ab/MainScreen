package com.myigou.dao;

import com.myigou.nitiy.Pm_category;
import com.myigou.realize.PublicInherit;

import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/15.
 */
public interface Pm_categoryDao{
    List<Pm_category> selectPm_category(Map map);
    Integer maxPm_category();
}
