package com.dl;

import javax.annotation.processing.SupportedSourceVersion;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("post");

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        System.out.println(id+"     "+name);
        System.out.println("xxx");
        System.out.println("哈哈哈哈哈");
        System.out.println("没有同步新版本，直接上传自己的代码");
        System.out.println("添加一条新的内容");
    }
}
