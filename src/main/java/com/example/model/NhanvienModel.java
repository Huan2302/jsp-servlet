package com.example.model;

public class NhanvienModel {
    private String IDNV;
    private String Hoten;
    private PhongBanModel pb;
    private String Diachi;
    private String IDPB;

    public String getIDPB() {
        return IDPB;
    }

    public void setIDPB(String IDPB) {
        this.IDPB = IDPB;
    }

    public String getIDNV() {
        return IDNV;
    }

    public void setIDNV(String IDNV) {
        this.IDNV = IDNV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public PhongBanModel getPb() {
        return pb;
    }

    public void setPb(PhongBanModel pb) {
        this.pb = pb;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
