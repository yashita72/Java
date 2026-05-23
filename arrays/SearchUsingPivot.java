package arrays;

import java.util.Scanner;

public class SearchUsingPivot {

    
    static int findPivot(int arr[], int n) {

        int low = 0;
        int high = n - 1;
        if (arr[low] <= arr[high]) {
            return n - 1;
        }
         while (low <= high) {
             int mid = low + (high - low) / 2;
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
      return -1;
    }

    
    static int binarySearch(int arr[], int low, int high, int target) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    
    static int search(int arr[], int n, int target) {

        int pivot = findPivot(arr, n);

        
        if (arr[pivot] == target) {
            return pivot;
        }

        
        if (target >= arr[0]) {
            return binarySearch(arr, 0, pivot - 1, target);
        }


        else {
            return binarySearch(arr, pivot + 1, n - 1, target);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int pivot;

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of rotated sorted array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int ans = search(arr, n, target);

        if (ans != -1)
        {
            System.out.println("Element found at index: " + ans);
            System.out.println("No of rotations"+(ans+1));
        }

        else
            System.out.println("Element not found");
    }
}