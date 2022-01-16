import java.util.Scanner;

public class OddPair {
        public static void main(String[] args) {
            System.out.println("Enter the Size of the array:");
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("Enter the "+n+" elements: ");
            int arr[]=new int [n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println("These are the pairs with odd product: ");
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n; j++) {
                    if((arr[i]*arr[j])%2==1 && i!=j)
                        System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
}
