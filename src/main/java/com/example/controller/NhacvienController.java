package com.example.controller;

import com.example.dao.impl.NhanvienDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/nhanvien")
public class NhacvienController extends HttpServlet {
    private NhanvienDao nv = new NhanvienDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listnv",nv.findAll());
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
