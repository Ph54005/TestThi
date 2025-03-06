
package com.example.tessst.phan1;

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    TinhTong tt = new TinhTong();
    @Test
    public void TinhTongThanhCong(){
        Assertions.assertEquals(2,tt.tinhTongBo6(new int[]{5,5,2,6}));
    }
    @Test
    public void TinhTongNgoaiLe(){
        Exception ext = Assertions.assertThrows(
                IllegalArgumentException.class,()->tt.tinhTongBo6(new int[]{})
        );
        Assertions.assertEquals("Mảng không được null hoặc rỗng",ext.getMessage());

    }

    @Test
    public void TinhTongAM(){
        Assertions.assertEquals(-2,tt.tinhTongBo6(new int[]{-5,-5,-6,-2}));
    }
    @Test
    public void TinhTongSoO(){
        Assertions.assertEquals(0,tt.tinhTongBo6(new int[]{0,0,0,0}));
    }

}