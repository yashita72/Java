package arrays;

import java.util.Scanner;

public class peakindexinmountainarray {
     public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the mountain array ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans =peakindexinmountainarray(arr, n );
        System.out.println( " Peak element found at index"+ans);
        
    }

    static int peakindexinmountainarray(int arr[], int n ) {

        int low = 0;
        int high = n-1 ;

        while (low < high) {

            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid+1])
                low = mid+1 ;
            else 
                high= mid ;
             
        }

        return low;
    }
}