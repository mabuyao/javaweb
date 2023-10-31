package com.xiaoma.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo06Servlet
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/19 10:17
 * @Version 1.0
 */
public class Demo06Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo06......");
        //服务器端内部转发
        //request.getRequestDispatcher("demo07").forward(request,response);
        //客户端重定向
        response.sendRedirect("demo07");
    }
}
