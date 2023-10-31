package com.xiaoma.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo05Servlet
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/19 10:17
 * @Version 1.0
 */
public class Demo05Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object unameObj = request.getSession().getAttribute("uname");
        System.out.println(unameObj);
    }
}
