package com.example.dao.impl;

import com.example.mapper.NhanvienMapper;
import com.example.model.NhanvienModel;

import java.util.List;

public class NhanvienDao extends AbstractDAO<NhanvienModel> {
    public List<NhanvienModel> findAll(){
        String sql = "SELECT * FROM nhanvien;";
        return query(sql,new NhanvienMapper());
    }

    public List<NhanvienModel> search(String search){
        String sql = "SELECT * FROM nhanvien where Hoten like '%"+search+"%'";
        return query(sql,new NhanvienMapper());
    }

    public void del(String id){
        String sql = "DELETE FROM nhanvien WHERE IDNV = '"+id+"'";
        update(sql,new NhanvienMapper());
    }

    public void insertnv(NhanvienModel nv){
        String sql = "INSERT INTO nhanvien(IDNV, Hoten, IDPB, Diachi) VALUES (?,?,?,?);";
        insert(sql,new NhanvienMapper(),nv.getIDNV(),nv.getHoten(),nv.getIDPB(),nv.getDiachi());
    }
    public static void main(String[] args) {
        NhanvienDao nv = new NhanvienDao();
        List<NhanvienModel> list = nv.findAll();
        System.out.println(list);
    }
}
