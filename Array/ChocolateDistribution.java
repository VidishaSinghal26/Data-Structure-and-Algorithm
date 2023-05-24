import java.util.*;
public class ChocolateDistribution {

    public static int minDiff(int[] arr , int m){
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0 ; i+m-1 <arr.length;i++ ){
            int diff = arr[i+m-1]-arr[i];
            if(diff < min){
                min = diff;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(minDiff(arr,m));
    }
}
