// Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
// Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

// Example 1:
// Input:
// N = 5
// A[] = {1,2,5,4,0}
// B[] = {2,4,5,0,1}
// Output: 1
// Explanation: Both the array can be rearranged to {0,1,2,4,5}

// Example 2:
// Input:
// N = 3
// A[] = {1,2,5}
// B[] = {2,4,15}
// Output: 0
// Explanation: A[] and B[] have only one common value.


class Solution{
 
//Method-1
//TC = O(n) , SC = O(n)

    public static boolean check(long A[],long B[],int N)
    {
        HashMap<Long , Integer> map = new HashMap<>();
        
        for(Long i : A){
                map.put(i , map.getOrDefault(i,0)+1);
        }
        for(int  i = 0 ;i<N;i++){
            if(!map.containsKey(B[i])){
                return false;
            }
            else{
                map.put(B[i] , map.get(B[i])-1);
                if(map.get(B[i]) == 0){
                    map.remove(B[i]);
                }
            }
        }
        if(!map.isEmpty()){
            return false;
        }
        return true
          
//Method-2
// TC = O(nlogn) SC = O(1)
          
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i<N ;i++){
            if(A[i] != B[i]){
                return false;
            }
        }
        return true;
    }
}
