// One array is given 
// You have to find all the elements which are greater than all of their right side elements.
// Array can be sorted or unsorted.
// Tc - O(n)
// Sc- 0(1)

// Ex- 7, 10, 4, 3, 6, 5, 2
// O/P:-10,6,5,2
// Here you can see that 10,6,5,2 is greater than all of its right elements.

// I/P:-10,20,30
// O/P:-30

import java.util.*;

public class Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();

        int j = 0;
        for (int i = d; i < n; i++) {
            int temp  = arr[i];
            arr[i] = arr[j];
            arr[j++] = temp;
        }
        // int k =0;
        // while(j<n){
        //     res[j++] = arr[k++];
        // }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
