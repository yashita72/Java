package arrays;

import java.util.Scanner;

public class firstandlastoccurance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int first = search(arr, target, true);

        int last = search(arr, target, false);

        System.out.println("First Occurrence = " + first);

        System.out.println("Last Occurrence = " + last);
    }

    public static int search(int arr[], int target, boolean findFirst) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == target) {

                ans = mid;

                if(findFirst) {
                    high = mid - 1;  
                }

                else {
                    low = mid + 1;   
                }
            }

            else if(arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}