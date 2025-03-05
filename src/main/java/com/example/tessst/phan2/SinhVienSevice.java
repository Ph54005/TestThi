package com.example.tessst.phan2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SinhVienSevice {
    List<SinhVien>list = new ArrayList<>();


    public String update(SinhVien sv,String maSv, String teSv, Integer tuoi, Float diemTB, Integer kiHoc, String chuyenNganh){
        if(sv == null){
            throw new IllegalArgumentException("sinh vien ko null");
        }
        sv.setMaSv(maSv);
        sv.setTeSv(teSv);
        sv.setTuoi(tuoi);
        sv.setDiemTB(diemTB);
        sv.setKiHoc(kiHoc);
        sv.setChuyenNganh(chuyenNganh);
        return "update thành công";
    }


    public SinhVien SearchID(Integer id){
        List<SinhVien>list2 = new ArrayList<>();
        for (SinhVien sv : list){
            if(sv.getId() == id){
                return sv;
            }

        }
        return null;

    }
    public void add(SinhVien sv){
        list.add(sv);
    }


}



































































































































//
//package com.example.tessst.phan2;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import java.util.Optional;
//
//public class SinhVienSevice {
//    List<SinhVien>list = new ArrayList<>();
//
//
//    public String update(SinhVien sv,String maSv, String teSv, Integer tuoi, Float diemTB, Integer kiHoc, String chuyenNganh){
//        if(sv == null){
//            throw new IllegalArgumentException("sinh vien ko null");
//        }
//        sv.setMaSv(maSv);
//        sv.setTeSv(teSv);
//        sv.setTuoi(tuoi);
//        sv.setDiemTB(diemTB);
//        sv.setKiHoc(kiHoc);
//        sv.setChuyenNganh(chuyenNganh);
//        return "update thành công";
//    }
//
//
//    public SinhVien SearchID(Integer id){
//        List<SinhVien>list2 = new ArrayList<>();
//        for (SinhVien sv : list){
//            if(sv.getId() == id){
//                return sv;
//            }
//
//        }
//        return null;
//
//    }
//    public void add(SinhVien sv){
//        list.add(sv);
//    }
//
//
//
//
//
//}
