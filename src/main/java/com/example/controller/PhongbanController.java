package com.example.controller;

import com.example.dao.impl.PhongBanDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/phongban")
public class PhongbanController extends HttpServlet {
    private PhongBanDao pb = new PhongBanDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listpb",pb.findAllPB());
        req.getRequestDispatcher("/phongban.jsp").forward(req,resp);
    }
}
