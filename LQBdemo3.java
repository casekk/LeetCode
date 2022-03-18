package com.Date;

/**
 * 将整数的奇偶位互换
 * 给定9，则其二进制形式位1001，应该得到的结果为0110
 */
public class LQBdemo3 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    // a b c d e f g h & 1010 1010 = a 0 c 0   e 0 g 0 >> 1   --->  0 a 0 c  0 e 0 g
    // a b c d e f g h & 0101 0101 = 0 b 0 d   0 f 0 h << 1    ---> b 0 d 0  f 0 h 0   与
    //                                                         ---> b a d c  f e h g
    public static int f(int x){
        int ou = x & 0xaaaaaaaa;
        int zuo = x & 0x55555555;
        return (ou >> 1) ^ (zuo << 1);
      //  return (ou >> 1) | (zuo << 1);
    }


}

