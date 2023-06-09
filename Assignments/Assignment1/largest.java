package Assignments.Assignment1;

import java.util.Scanner;

public class largest {
       public static void main(String[] args) {
              //swappping two number
              int x = 10;
              int y = 20;
              x = x ^ y;
              y = x ^ y;
              x=x^y;
              System.out.println(x+" "+y);
              Scanner sc = new Scanner(System.in);
              int a = sc.nextInt();
              int b = sc.nextInt();
              int c = sc.nextInt();
              int max = a;
              if (a > b && a > c) {
                     System.out.println("max :" + a);

              } else if (a < b && b > c) {
                     System.out.println("max :" + b);
              } else
                     System.out.println("max :" + c);
       }

}
