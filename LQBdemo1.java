package com.Date;

import java.util.Arrays;
import java.util.Random;

public class LQBdemo1 {
 //找出成对唯一的数,找出数组中重复的数
    public static void Find(int arr[]){
        int num = arr.length;
        for (int i = 0;i < num;i++){
            for (int j = i+1;j < num;j++){
                if ((arr[i]^arr[j]) == 0){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }


    //找出落单的数
    //x ^ 0 = x    ||   x ^ x = 0
    public static void Find2(int []a){
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            x = x ^ a[i];
        }
        System.out.println(x);
    }


    //测试
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,3};
        Find(a);

        //随机数组
        int num = 10;
        int []arr = new int[num];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = i+1;

        }
        arr[arr.length-1] = new Random().nextInt(num-1)+1;
        System.out.println(Arrays.toString(arr));

        Find(arr);

        int a1[] = {1,2,3,4,5,4,3,2,1};
        Find2(a1);
    }

}
