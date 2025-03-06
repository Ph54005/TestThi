


package com.example.tessst.phan2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NhanVienSeviceTest {
    NhanVienSevice sevice = new NhanVienSevice();
    private NhanVien nhanVien;
    @BeforeEach
    public void setup(){
        nhanVien = new NhanVien("SV0010", "Nguyen Van A", 20, 8.5f, 3, "CNTT");
    }
    @Test
    public void Update(){

        Assertions.assertEquals("update thành công",sevice.update(nhanVien,"SV001022", "Nguyen Van A", 20, 8.5f, 3, "CNTT"));
    }
    @Test
    public void UpdateNgoaiLe(){
        Exception ext = Assertions.assertThrows(
                IllegalArgumentException.class,()->sevice.update(null,"SV001022", "Nguyen Van A", 20, 8.5f, 3, "CNTT"));

        Assertions.assertEquals("sinh vien ko null",ext.getMessage());

    }
    @Test
    public void UpdateNgoaiLenhoHon0(){
        Exception ext = Assertions.assertThrows(
                IllegalArgumentException.class,()->sevice.update(nhanVien,"SV001022", "Nguyen Van A", 20, -8.5f, -3, "CNTT"));

        Assertions.assertEquals("lương và số năm không được âm",ext.getMessage());

    }





}