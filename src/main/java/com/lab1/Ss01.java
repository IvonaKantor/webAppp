package com.lab1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ss01 extends HttpServlet {

    public Ss01() {
        System.out.println("Ss01");
    }


    public void init(ServletConfig config) throws ServletException {
        super.init();
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>S01 servlet is working</h1>");
        out.close();
    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("Ss01");
        out.close();
    }
}
