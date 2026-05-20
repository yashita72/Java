package arrays;

import java.util.Scanner;

public class ceilingofanumber {
     public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements in sorted manner");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched");
        int s = sc.nextInt();

        int ans =ceilingofanumber(arr, n, s);
        System.out.println( "element found at index"+ans);
        
    }

    static int ceilingofanumber(int arr[], int n, int s) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > s)
                high = mid - 1;

            else if (arr[mid] < s)
                low = mid + 1;

            else {
                
                return mid ;
            }
        }

        return low;
    }
}