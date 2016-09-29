package com.myigou.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ab1324ab on 2016/9/16.
 */
public class Land extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String exit=req.getParameter("exit");
        if(exit==null|"".equals(exit)){
            req.getSession().removeAttribute("user");
            this.doPost(req,resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String user=req.getParameter("user");
        String pwd=req.getParameter("pwd");
        req.getSession().setAttribute("user",user);
        //错误因为转发post请求变成get请求 注意:
        resp.sendRedirect("/do/ServletMessageLeiDaoImp?HomePage=HomePage&tab=sel");
    }
}
