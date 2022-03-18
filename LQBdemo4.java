package com.Date;
/*
     二进制表示浮点实数
 */
public class LQBdemo4 {
    public static void main(String[] args) {
      double num = 0.625;
      StringBuilder sb = new StringBuilder("0.");
      int count = 0;

      while(num > 0){
          double t = num * 2;
          count++;

          if (t >= 1){
              sb.append("1");
              num = t - 1;
          }else {
              sb.append("0");
              num = t;
          }
      }
        System.out.println("计数器："+count);
      if(sb.length() > 32){
          System.out.println("ERROR");
      }else {
          System.out.println(sb);
      }

    }
}
