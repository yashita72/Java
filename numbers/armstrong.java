package numbers;
import java.util.Scanner;
public class armstrong {
         public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            int num=n;
            int dig;
            int sum=0;
            while(n>0){
                dig=n%10;
                sum= sum+dig*dig*dig;
                 n=n/10;
                 System.out.println(sum);
            }
            if(num==sum){
            System.out.println("yes its an armstrong number");
            }
            else{
             System.out.println("not an armstrong number");   
         }
        }


    
}

