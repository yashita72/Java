package arrays;

import java.util.Scanner;

public class searchinrotatedsortedarray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements in sorted manner");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("normal array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
       
        System.out.println("Enter the number of rotation to be made");
        int k = sc.nextInt();
        System.out.println("Enter the type of rotation :1)left rotation ,2)right rotation ");
        int choice=sc.nextInt();
        rotation(arr,k,n,choice);
         System.out.println("rotated  array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
         System.out.println();
         System.out.println("Enter the element to be searched");
        int s= sc.nextInt();
        int ans =searchinrotatedsortedarray(arr,n,s);
        System.out.println( "element found at index"+ans);
        
    }

    static int searchinrotatedsortedarray(int arr[], int n, int s) {
        int target=s;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(arr[low]<arr[mid]){
              if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
                else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }

                }

            
            }
        

        return -1;
    }
    static void rotation(int arr[],int k,int n,int choice){
        if(choice==1){

        //reverse first k elements
        reverse(arr, 0, k - 1);

        //reverse remaining elements
        reverse(arr, k, n - 1);

        //reverse whole array
        reverse(arr, 0, n - 1);
          }
        else{

        //reverse whole array
        reverse(arr, 0, n - 1);

        //reverse first k elements
        reverse(arr, 0, k - 1);

        //reverse remaining elements
        reverse(arr, k, n - 1);}
         
    }
    static void reverse(int arr[], int low, int high) {

        while (low < high) {

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
}
}
