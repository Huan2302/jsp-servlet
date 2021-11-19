package com.example.controller;

import com.example.dao.impl.NhanvienDao;
import com.example.uitil.AuthUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del")
public class DelNhanvienController extends HttpServlet {
    private NhanvienDao nv= new NhanvienDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            if (!AuthUtil.checkLogin(req,resp)){
                resp.sendRedirect(req.getContextPath()+"/login");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String id = req.getParameter("id");
        nv.del(id);
        req.setAttribute("listnv",nv.findAll());
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
