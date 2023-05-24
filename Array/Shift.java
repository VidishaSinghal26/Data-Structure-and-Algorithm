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
