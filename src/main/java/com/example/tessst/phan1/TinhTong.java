package com.example.tessst.phan1;

public class TinhTong {
    public int TinhTongSoChan(int[] arrNumber){
        if(arrNumber == null || arrNumber.length == 0){
            throw new IllegalArgumentException("mang ko duoc null");
        }

        int tong = 0;
        for(int i : arrNumber){
            if(i % 2 != 0){

                tong += i;
            }

        }
        return tong;
    }
}




























































































//
//package com.example.tessst.phan1;
//
//public class TinhTong {
//    public int TinhTongSoChan(int[] arrNumber){
//        if(arrNumber == null || arrNumber.length == 0){
//            throw new IllegalArgumentException("mang ko duoc null");
//        }
//
//        int tong = 0;
//        for(int i : arrNumber){
//            if(i % 2 != 0){
//
//                tong += i;
//            }
//
//        }
//        return tong;
//    }
//}
