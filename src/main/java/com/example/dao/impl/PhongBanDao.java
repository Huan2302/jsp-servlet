package com.example.dao.impl;

import com.example.mapper.PhongBanMapper;
import com.example.model.PhongBanModel;

import java.util.List;

public class PhongBanDao extends AbstractDAO<PhongBanModel> {
    public List<PhongBanModel> findAllPB(){
        String sql = "select * from phongban";
        return query(sql,new PhongBanMapper());
    }
}
