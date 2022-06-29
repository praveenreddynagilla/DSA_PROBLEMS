class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;             //we can write this type also. //to find the final range 
//         int addition=n*(n+1)/2;  //approach 1 it is optimized O(n) complexity but when we get large input it will get Overflow Integer so Use approach 2.
       
//         for(int i=0;i<n;i++){
//             addition=addition-nums[i];
//         }
//         return addition;
        int x1=0;                 // approach 2 most optimized for large numbers also
        for(int i=1;i<=n;i++){ //calculating sum of actual sum of range
            x1 = (x1^i);
        }
        int x2=0;
        for(int i=0;i<n;i++){  // calculating sum of values of array
            x2=x2^nums[i];
        }
        return x1^x2 ; //we are finding the missing value by substracting array sum from actual sum.
        
        
    }
}
