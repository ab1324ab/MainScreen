package com.myigou.servlet;

import com.myigou.BizLei.Pages;
import com.myigou.nitiy.MessageLei;
import com.myigou.realize.MessageLeiDaoImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by tz on 2016-09-16.
 */
@WebServlet(name = "ServletMessageLeiDaoImp")
public class ServletMessageLeiDaoImp extends HttpServlet {
    private final String INSERT = "ins";
    private final String SELECT = "sel";
    private final String ISDEL = "del";
    private String tab;
    private String integer = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        tab = request.getParameter("tab");//创建标记
        if (INSERT.equals(tab)) {//增加留言
            String message = request.getParameter("Message");
            MessageLei messageLei = new MessageLei();
            messageLei.setMessageid(UUID.randomUUID().toString());
            messageLei.setThemessageip(request.getRemoteAddr());
            messageLei.setIsdel("1");
            messageLei.setMessagecontent(message);
            messageLei.setMessagename(request.getSession().getAttribute("user").toString());
            messageLei.setMessagetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            MessageLeiDaoImp.insertThes(messageLei);
        } else if (ISDEL.equals(tab)) {//删除留言


        }
        //查询逻辑开始位置
        Map map = new HashMap();
        //判断主页标记
        if ("HomePage".equals(request.getParameter("HomePage"))) {
            //System.out.println("HomePage");
            map.put("min", 0);
            map.put("max", 2);
            request.getSession().setAttribute("pag", 1);
        }
        integer = request.getParameter("page");//拿到页码
        Object i = request.getSession().getAttribute("yema");//拿到翻页页码
        Integer yima = (Integer) i;//转换成数字
        /*翻页逻辑-上一页*/
        if ("topPage".equals(request.getParameter("HomePage"))) {
            if (yima == null) {
                yima = Pages.page();
            }
            yima--;
            if (yima <= 0) {
                yima = Pages.page();
            }
            System.out.println("上一页:" + yima);
        }
         /*翻页逻辑-下一页*/
        if ("belowPage".equals(request.getParameter("HomePage"))) {
            if (yima == null) {
                yima = 2;
            }
            yima++;
            if (yima >= Pages.page()) {
                yima = 1;
            }
            System.out.println("下一页:" + yima);
        }
        /*翻页逻辑-共享属性*/
        if ("belowPage".equals(request.getParameter("HomePage")) | "topPage".equals(request.getParameter("HomePage"))) {
            if (yima == 1) {//页码为1单独判断
                map.put("min", 0);
                map.put("max", 2);
            } else {
                map.put("min", Pages.xianshi(yima - 1));
                map.put("max", 3);
            }
            if (yima == 1) {//页码为1 写标记
                request.getSession().setAttribute("pag", 1);
            } else {
                request.getSession().setAttribute("pag", 2);
            }
        }
        //分页逻辑
        if ("yepage".equals(request.getParameter("HomePage"))) {
            Integer integers = Integer.valueOf(integer);
            if (integer == null) {
                integers = 2;
            }
            map.put("min", Pages.xianshi(integers - 1));
            map.put("max", 3);
            request.getSession().setAttribute("pag", 2);
        }//查询逻辑结束
        List<MessageLei> messageLeis = MessageLeiDaoImp.selectAlls(map);//map 查询操作变量
        request.setAttribute("pages", Pages.page());
        request.setAttribute("messageLeis", messageLeis);
        //保存页码
        request.getServletContext().setAttribute("maxallcounts", MessageLeiDaoImp.allcounts());
        request.getSession().setAttribute("page", integer);
        request.getSession().setAttribute("yema", yima);
        //处理完毕送去转发页面
        request.getRequestDispatcher("/do/Forwards?forward=index").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过转发之后变成get请求在此转换成post请求
        doPost(request, response);
    }
}
