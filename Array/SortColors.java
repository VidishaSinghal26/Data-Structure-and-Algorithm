// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

 

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

class Solution
{
    public static void sort012(int a[], int n)
    {
       int low = 0;
       int mid = 0;
       int high = n-1;
       while(mid <= high){
           if(a[mid] == 0){
               swap(low,mid,a);
               low++;
               mid++;
           }
           else if(a[mid] == 1){
               mid++;
           }
           else{
               swap(mid,high,a);
               high--;
           }
       }
    }
    public static void swap(int a , int b ,int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
