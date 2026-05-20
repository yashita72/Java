package arrays;
import java.util.Scanner;
public class linearsearch{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("enter the size of the array");
        int n =sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int s=sc.nextInt();
         for(int i=0;i<=n;i++){
            if(a[i]==s){
                flag++;
                break;
            }
        }
        if(flag==1)
            System.out.println("element found ");
        else
            System.out.println("not found");
        }
    }

