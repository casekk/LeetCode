package com.Date;

import java.util.Scanner;

public class LQBdemo2 {
    //�ж϶��������е� 1 �ĸ���
    // 1001111
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(Integer.toString(a,2));

        System.out.println("���� 1�� "+NumberOf1(a));
        System.out.println("���� 2�� "+NumberOf2(a));
        System.out.println("���� 3�� "+NumberOf3(a));



    }

    /**
     * ������� ���ƶ� ���� 1 ���� ��1110 0110 --> 0000 0000 ��ʱ������ѭ��
     * @param n
     */
    public static int NumberOf1(int n) {
        int count = 0;
        int flag = 1;

        while(flag != 0) {

            if((n & flag) != 0) {
                count++;
            }

            flag = flag << 1;

        }
        return count;
    }

                                          //   --->
    public static int NumberOf2(int m){   // 1100 1101
        int temp = 0;
        for (int i = 0; i < 32;i++){
            if (((m >> i) & 1) == 1){
                temp++;
            }
        }
        return temp;
    }

    public static int NumberOf3(int p)  {
        int temp = 0;
        int flag = 1;
        while(p  != 0){
           p = (p-1)& p;
            temp++;
        }
        return temp;

    }



}
