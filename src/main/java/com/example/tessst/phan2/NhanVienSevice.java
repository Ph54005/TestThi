


package com.example.tessst.phan2;

import java.util.ArrayList;
import java.util.List;

public class NhanVienSevice {
    List<NhanVien>list = new ArrayList<>();


    public String update(NhanVien sv, String maNV, String teNv, Integer tuoi, Float luong, Integer soNamLam, String phongBan){
        if(sv == null){
            throw new IllegalArgumentException("sinh vien ko null");
        }
        if(luong < 0 || soNamLam < 0){
            throw new IllegalArgumentException("lương và số năm không được âm");
        }

        sv.setMaNV(maNV);
        sv.setTeNv(teNv);
        sv.setTuoi(tuoi);
        sv.setLuong(luong);
        sv.setSoNamLam(soNamLam);
        sv.setPhongBan(phongBan);

        return "update thành công";
    }




}
