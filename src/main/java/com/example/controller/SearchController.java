package com.example.controller;

import com.example.dao.impl.NhanvienDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/search")
public class SearchController extends HttpServlet {
    private NhanvienDao nv = new NhanvienDao();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String search = req.getParameter("search");
        req.setAttribute("search",nv.search(search));
        req.getRequestDispatcher("/search.jsp").forward(req,resp);
    }
}
