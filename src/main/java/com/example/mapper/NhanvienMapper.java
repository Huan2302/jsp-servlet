package com.example.mapper;

import com.example.model.NhanvienModel;
import com.example.model.PhongBanModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NhanvienMapper implements RowMapper<NhanvienModel>{
    @Override
    public NhanvienModel mapRow(ResultSet rs) {
        NhanvienModel nv = new NhanvienModel();
        try {
            nv.setIDNV(rs.getString("IDNV"));
            nv.setDiachi(rs.getString("Diachi"));
            nv.setHoten(rs.getString("Hoten"));
            nv.setIDPB(rs.getString("IDPB"));
            try{
                PhongBanModel pb = new PhongBanModel();
                pb.setIDPB(rs.getString("IDPB"));
                pb.setMota(rs.getString("Mota"));
                pb.setTenpb(rs.getString("Tenpb"));
                nv.setPb(pb);
                return nv;
            }catch (SQLException throwables1){
                throwables1.getMessage();
            }
            return nv;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
