package Assignments.Assignment2;

import java.util.Scanner;

public class SummofDigit {
       //7685=7+6+8+5;
       public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              int num=sc.nextInt();
              int sum=0;
              while(num!=0){
                  sum=(num%10)+sum;
                  num=num/10;
              }
              System.out.println(sum);
       }
}
