public class SecondLargest {

    public static int secLar(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(secmax)
        }
        max =0;
        for(int i =0 ;i<n;i++){
            max = Math.max(max, arr[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8,4,5};
        System.out.println(secLar(arr));
    }
}
