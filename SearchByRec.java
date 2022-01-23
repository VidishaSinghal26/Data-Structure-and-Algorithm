import java.util.Scanner;

public class SearchByRec {
    public static int find(int arr[],int currentIndex,int search_value)
    {
        if( currentIndex > arr.length) {
            return 1;
        }
        if (arr[currentIndex] == search_value) {
            return currentIndex;
        }
        return find(arr, currentIndex + 1, search_value);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int search_value=sc.nextInt();
        System.out.println(find(arr,0,search_value));
    }

}
