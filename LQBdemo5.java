package com.Date;
public class LQBdemo5 {
    public static void main(String[] args) {
        System.out.println(f(5));
        f2(1,4);
    }

    //求一个数的阶乘
    /*
      找重复  找边界  找变化
      (N - 1)是问题的重复
    */
    public static int f(int x){
        int num ;
        if (x == 1){   //边界
            return 1;
        }
        num = f(x - 1) * x;
        return num;
    }

    //打印从 i 到 j
    static void f2(int i , int j){
        if (i > j){
            return;
        }
        System.out.println(i);
        f2(i+1,j);
    }

    //对数组中的所有元素求和
    static int f3(int []arr,int begin){
        if (begin == arr.length){
            return arr[begin];
        }
        return arr[begin] + f3(arr,begin);
    }
}
