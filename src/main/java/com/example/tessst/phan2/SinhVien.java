package com.example.tessst.phan2;

public class SinhVien {
   private Integer id;
   private String maSv;
   private String teSv;
   private Integer tuoi;
   private Float diemTB;
   private Integer kiHoc;
   private String chuyenNganh;




    public SinhVien(Integer id, String maSv, String teSv, Integer tuoi, Float diemTB, Integer kiHoc, String chuyenNganh) {
        if(maSv == null || teSv == null  || tuoi == null  || diemTB == null  ||
                kiHoc == null  || maSv == null  || chuyenNganh == null  ){
            throw new IllegalArgumentException("Các trường không để null");
        }
        this.id = id;
        this.maSv = maSv;
        this.teSv = teSv;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
        this.kiHoc = kiHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public SinhVien() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTeSv() {
        return teSv;
    }

    public void setTeSv(String teSv) {
        this.teSv = teSv;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Float diemTB) {
        this.diemTB = diemTB;
    }

    public Integer getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(Integer kiHoc) {
        this.kiHoc = kiHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
