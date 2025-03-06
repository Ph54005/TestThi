package com.example.tessst.phan1;

import java.util.Arrays;

public class TinhTong {

    public int tinhTongBo6(int[] arrNumber) {
        if (arrNumber == null || arrNumber.length == 0) {
            throw new IllegalArgumentException("Mảng không được null hoặc rỗng");
        }
        return Arrays.stream(arrNumber)
                .filter(n -> n % 6 != 0 && n % 2 ==0)
                .sum();
    }
}
































































































