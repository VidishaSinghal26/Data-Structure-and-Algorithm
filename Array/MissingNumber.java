// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

// Example 1:
// Input:
// N = 5
// A[] = {1,2,3,5}
// Output: 4
  
// Example 2:
// Input:
// N = 10
// A[] = {6,1,2,8,3,4,7,10,5}
// Output: 9
  
  class Solution {
    int missingNumber(int array[], int n) {
      
  //Method-1 ( TC - O(nlogn)  )
        int res = 0;
        Arrays.sort(array);
        int i =1;
        for( i = 1 ; i < n ; i++ ){
            res = i^ array[i-1];
            if( res != 0){
                return i;
            }
        }
        return i;
        
 //Method-2 ( TC - O(n) )
      
        int totalSum = (n*(n+1))/2;
        int arrSum = 0;
        for(int i=0; i<n-1; i++){
            arrSum+=array[i];
        }
        return totalSum-arrSum;
    }
}
