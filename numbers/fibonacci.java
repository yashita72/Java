package numbers;
import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.println("Fibonacci Series:");
        System.out.print(a + " " + b+" ");
        for(int i =2;i<n;i++)
        {
             c=a+b;
             a=b;
             b=c;
            System.out.print(c + " " );  
        }
    }
}