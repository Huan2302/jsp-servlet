package com.example.dao.impl;

import com.example.mapper.AdminMapper;
import com.example.model.AdminModel;

import java.util.List;

public class AdminDAO extends AbstractDAO<AdminModel>{

    public List<AdminModel> login(){
        String sql = "select * from admin;";
        return query(sql,new AdminMapper());
    }
}
