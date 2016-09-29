package com.myigou.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ab1324ab on 2016/9/16.
 */
@WebFilter(filterName = "FilterDoPeth")
public class FilterDoPeth implements Filter {
    public void destroy() {
        System.out.println("关闭资源");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("我来拦一下！");
        HttpServletRequest request=(HttpServletRequest) req;
        HttpServletResponse response=(HttpServletResponse)resp;
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String user=(String)request.getSession().getAttribute("user");
        //System.out.println(user)
        if ("".equals(user)|user==null){
            //request.getRequestDispatcher(request.getContextPath()+"/index.html").forward(request,response);
             response.sendRedirect(request.getContextPath()+"/index.html");
            return;
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("我就是来看看，初始化！");
    }

}
