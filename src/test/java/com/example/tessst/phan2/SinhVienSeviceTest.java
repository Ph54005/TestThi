package com.example.tessst.phan2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienSeviceTest {
    SinhVienSevice sevice = new SinhVienSevice();
    private SinhVien sinhVien;
    @BeforeEach
    public void setup(){

        sevice.add(new SinhVien(1,"SV001", "Nguyen Van A", 20, 8.5f, 3, "CNTT"));
        sevice.add(new SinhVien(2,"SV001", "Nguyen Van A", 20, 8.5f, 3, "CNTT"));
        sevice.add(new SinhVien(3,"SV001", "Nguyen Van A", 20, 8.5f, 3, "CNTT"));
        sevice.add(new SinhVien(4,"SV001", "Nguyen Van A", 20, 8.5f, 3, "CNTT"));

    }
    @Test
    public void SearchId(){

        Assertions.assertEquals(null,sevice.SearchID(10));
    }
    @Test
    public void Update(){
      SinhVien sinhVien1 =  sevice.SearchID(3);
        Assertions.assertEquals("update thành công",sevice.update(sinhVien1,"SV0010", "Nguyen Van A", 20, 8.5f, 3, "CNTT"));
    }

    @Test
    public void UpdateSinhVienNull(){
        SinhVien sinhVien1 =  sevice.SearchID(3);
        Exception ext = Assertions.assertThrows(
                IllegalArgumentException.class,() -> sevice.update(null,"SV0010", "Nguyen Van A", 20, 8.5f, 3, "CNTT"));
        Assertions.assertEquals("sinh vien ko null",ext.getMessage());
    }









}