import java.util.Scanner;
public class primeno{
       public static void main(String[] args) {
              System.out.println("enetr a no to cheeck prime ");
           Scanner sc=new Scanner(System.in) ;
           int a= sc.nextInt();
           for (int i = 2; i*i < a; i++) {
              if(a%i==0){
                   System.out.println("Not prime");  
                   return;
              }
              
               
           }
           System.out.println("prime no");
 
       }
}