package com.example.mapper;

import com.example.model.AdminModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminMapper implements RowMapper<AdminModel>{
    @Override
    public AdminModel mapRow(ResultSet rs) {
        AdminModel ad = new AdminModel();
        try {
            ad.setUsername(rs.getString("username"));
            ad.setPassword(rs.getString("password"));
            return ad;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
