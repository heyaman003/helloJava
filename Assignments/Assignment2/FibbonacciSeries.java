package Assignments.Assignment2;
import java.util.Scanner;
public class FibbonacciSeries {
       public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt() ;
             fibbo(num);
       }
       public static void fibbo( int n){
              int fibbo=0;
              int a=0;
              int b=1;
              for (int i = 1; i <=n; i++) {
                     if(i<2){
                            System.out.print( "fibbonaci series are :" +a+"," +b+ ",");
                     }
                     else{
                          
                       fibbo=a+b;
                       a=b;
                       b=fibbo;
                     System.out.print(fibbo+",");  
                     }
                       
              }
       }
}
