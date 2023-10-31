package com.xiaoma.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo02Servlet
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/18 15:19
 * @Version 1.0
 */
public class Demo02Servlet extends HttpServlet {
    public Demo02Servlet(){
        System.out.println("正在实例化....");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("正在初始化.....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("正在服务.....");
    }

    @Override
    public void destroy() {
        System.out.println("正在销毁......");
    }
}
