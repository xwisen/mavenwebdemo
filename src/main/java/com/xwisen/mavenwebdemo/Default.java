package com.xwisen.mavenwebdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;


@WebServlet("/")
public class Default extends HttpServlet {
    private String message;
    public void init() throws ServletException {
        message = "default";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Logger log=Logger.getLogger("xwisen");
        log.info("mapping url /");
        // 设置响应内容类型
        response.setContentType("text/html");
        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }
}