/*Write a program to input the elements of a two- dimensional array. Then from this array, make two arrays one that stores all odd elements of the two-dimensional array and the other that stores all even elements of the array. 
Note:-  Resulting arrays will be of ArrayList type*/


import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] % 2==0)
                {
                    even.add(arr[i][j]);
                }
                else
                {
                    odd.add(arr[i][j]);
                }
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
