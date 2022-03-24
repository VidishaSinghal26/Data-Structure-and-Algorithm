package sorting;

import java.util.Scanner;

public class InsertionSort {
    static int[] arr;
    public static void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i;
            while (j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
    public static void display2()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        display2();
    }
}
