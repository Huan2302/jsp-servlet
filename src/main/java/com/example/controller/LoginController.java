package com.example.controller;

import com.example.dao.impl.AdminDAO;
import com.example.model.AdminModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private AdminDAO adminDAO = new AdminDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");
        List<AdminModel> list = adminDAO.login();
        for (AdminModel item : list){
            if (item.getUsername().equals(user) && item.getPassword().equals(pass)){
                HttpSession session =req.getSession();
                session.setAttribute("admin",item);
                resp.sendRedirect(req.getContextPath()+"/nhanvien");

                return;
            }
        }
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }
}
