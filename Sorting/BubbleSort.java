package sorting;

import java.util.Scanner;

public class BubbleSort {
    static int[] arr;
    public static void bubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]> arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void display1()
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
        bubbleSort(arr);
        display1();
    }

}
