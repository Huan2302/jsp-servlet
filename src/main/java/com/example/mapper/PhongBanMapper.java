package com.example.mapper;

import com.example.model.PhongBanModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PhongBanMapper implements RowMapper<PhongBanModel>{
    @Override
    public PhongBanModel mapRow(ResultSet rs) {
        try {
            PhongBanModel pb = new PhongBanModel();
            pb.setIDPB(rs.getString("IDPB"));
            pb.setMota(rs.getString("Mota"));
            pb.setTenpb(rs.getString("Tenpb"));
            return pb;
        } catch (SQLException e) {
            return null;
        }
    }
}
