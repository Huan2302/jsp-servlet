package com.example.controller;

import com.example.dao.impl.NhanvienDao;
import com.example.dao.impl.PhongBanDao;
import com.example.model.NhanvienModel;
import com.example.uitil.AuthUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddNhanvienController extends HttpServlet {
    private PhongBanDao pb = new PhongBanDao();
    private NhanvienDao nvdao = new NhanvienDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            if (!AuthUtil.checkLogin(req,resp)){
                resp.sendRedirect(req.getContextPath()+"/login");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        req.setAttribute("phongban",pb.findAllPB());
        req.getRequestDispatcher("/addnv.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("abc");
        NhanvienModel nv = new NhanvienModel();
        nv.setIDNV(req.getParameter("id"));
        nv.setIDPB(req.getParameter("phongban"));
        nv.setHoten(req.getParameter("name"));
        nv.setDiachi(req.getParameter("diachi"));
        try{
            nvdao.insertnv(nv);
            req.getRequestDispatcher("/nhanvien").forward(req,resp);
        }catch (Exception e){
            req.getRequestDispatcher("/nhanvien").forward(req,resp);
        }

    }
}
