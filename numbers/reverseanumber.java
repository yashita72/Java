package numbers;
import java.util.Scanner;
public class reverseanumber {
         public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            int dig;
            int rev=0;
            while(n>0){
                dig=n%10;
                rev=rev*10+dig;
                n=n/10;
            }
            System.out.println(rev);
         }


    
}
