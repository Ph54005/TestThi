package com.example.tessst.phan2;

public class NhanVien {
   private String maNV;
   private String teNv;
   private Integer tuoi;
   private Float luong;
   private Integer SoNamLam;
   private String phongBan;

    public NhanVien(String maNV, String teNv, Integer tuoi, Float luong, Integer soNamLam, String phongBan) {
        if(maNV == null || teNv == null ||tuoi == null ||luong == null ||soNamLam == null ||phongBan == null ){
            throw new IllegalArgumentException("Các trường không null");
        }
        this.maNV = maNV;
        this.teNv = teNv;
        this.tuoi = tuoi;
        this.luong = luong;
        SoNamLam = soNamLam;
        this.phongBan = phongBan;
    }

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTeNv() {
        return teNv;
    }

    public void setTeNv(String teNv) {
        this.teNv = teNv;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public Integer getSoNamLam() {
        return SoNamLam;
    }

    public void setSoNamLam(Integer soNamLam) {
        SoNamLam = soNamLam;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
}
