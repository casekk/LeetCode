package com.Date;

import java.util.Arrays;
import java.util.Scanner;

public class LQBdemo6 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int [][]team = new int[20][5];
      for (int i = 0;i < 20;i++){
          for (int j = 0; j < 5; j++) {
              team[i][j] = scanner.nextInt();
          }
      }
      int maxSum = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20;j++){
                for (int k = 0; k < 20; k++) {
                    for (int l = 0; l < 20; l++) {
                        for (int m = 0; m < 20; m++) {
                            if ((i != j && i != k && i != l && i != m) && (j != k && j != l && j!= m) && (k != l && k != m) && (l != m)){
                                int max =  team[i][0] + team[j][0] + team[k][0] +team[l][0] + team[m][0];
                                if (max > maxSum){
                                    max = maxSum;
                                }
                                System.out.println(maxSum);
                            }
                        }
                    }
                }
            }
        }

    }
}
