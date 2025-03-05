package com.example.tessst.phan1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    TinhTong tt = new TinhTong();
    @Test
    public void TinhTongThanhCong(){
        Assertions.assertEquals(10,tt.TinhTongSoChan(new int[]{5,5,2}));
    }
    @Test
    public void TinhTongNgoaiLe(){
        Exception ext = Assertions.assertThrows(
                IllegalArgumentException.class,()->tt.TinhTongSoChan(new int[]{})
        );
        Assertions.assertEquals("mang ko duoc null",ext.getMessage());

    }

    @Test
    public void TinhTongAM(){
        Assertions.assertEquals(-10,tt.TinhTongSoChan(new int[]{-5,-5}));
    }
    @Test
    public void TinhTongSoO(){
        Assertions.assertEquals(0,tt.TinhTongSoChan(new int[]{-5,5}));
    }

}


















































































