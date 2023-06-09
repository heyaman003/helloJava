package Assignments.Assignment2;
import java.util.*;
public class reverseNumber {
  public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int temp;
       int reversenumber=0;
     while(a!=0){
        reversenumber=reversenumber*10+(a%10);
        a=a/10;  
       }
       System.out.println(reversenumber);
  }     
}
