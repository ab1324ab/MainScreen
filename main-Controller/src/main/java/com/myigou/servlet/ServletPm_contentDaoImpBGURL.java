package com.myigou.servlet;

import com.myigou.nitiy.Pm_content;
import com.myigou.realize.Pm_contentDaoImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ab1324ab on 2016/9/21.
 */
@WebServlet(name = "ServletPm_contentDaoImp")
public class ServletPm_contentDaoImpBGURL extends HttpServlet {
    private final String TOP = "top";
    private final String BELOW = "below";
    private final String TIME = "time";
    private int max;
    private Integer i;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String xuanze = request.getParameter("xuanze");
        PrintWriter out = response.getWriter();
        //System.out.println("'"+xuanze+"'");
        Map map = new HashMap();
        i = (Integer) request.getSession().getAttribute("ServletPm_contentDaoImpBGURL");
        if ("".equals(i) | i == null) {
            i = 0;
        }
        max = Pm_contentDaoImp.maxContent();
        if (BELOW.equals(xuanze)) {
            i--;
            if (i < 0) i = max;
        }
        if (TOP.equals(xuanze)) {
            i++;
            if (i > max) i = 0;
        }
        //System.out.println(i);

        map.put("min", i);
        map.put("max", 1);
        List<Pm_content> list = Pm_contentDaoImp.selectContent(map);
        for (Pm_content li : list) {
            out.print(li.getPmPicBigUrl());
        }
        request.getSession().setAttribute("ServletPm_contentDaoImpBGURL", i);
        request.getSession().setAttribute("zon", Pm_contentDaoImp.maxContent());
        return;
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String xuanze = request.getParameter("xuanze");
        PrintWriter out = response.getWriter();
        if (TIME.equals(xuanze)) {
            Integer integer = (Integer) request.getSession().getAttribute("ServletPm_contentDaoImpBGURL");
            if (integer == null | "".equals(integer)) {
                integer = 1;
            }
            out.print("当前" + integer + "页 总共" + max + "页");
        }

    }
}
