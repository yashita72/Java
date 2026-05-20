package arrays;

import java.util.Scanner;

public class nextgreatestletter {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        char letters[] = new char[n];

        System.out.println("Enter the elements in sorted manner");

        for (int i = 0; i < n; i++) {
            letters[i] = sc.next().charAt(0);
        }

        System.out.println("Enter the character to be searched");
        char s = sc.next().charAt(0);

        char ans = smallestlettergreaterthanthetarget(letters, s);

        System.out.println("Next greatest letter is: " + ans);
    }

    public static char smallestlettergreaterthanthetarget(char arr[], char s) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > s) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return arr[low % arr.length];
    }
}