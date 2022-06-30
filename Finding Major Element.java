class Solution {
    public int majorityElement(int[] nums) {
//        int n=nums.length;
//         int majority=0;
    
//         for(int i=0;i<n;i++){             //WRITING CODE IN O(N^2) COMPLEXITY
//             int count=1;
//             for(int j=i;j<n;j++){
//                 if(nums[i]==nums[j]){
                    
                
//                 count++;
//                 }
//             if(count>n/2){
//                 return majority= nums[i] ;
//             }
//             }
            
//         }
//         return majority;
        
        int m=0;                        //BOYER MORR METHOD
        int count=0;
        for(int i=0;i<nums.length;i++){  // TRYING TO DO WITH O(N) COMPLEXITY
            if(count==0){      //if count 0 then update the majority value
                m=nums[i];
                count++;  // and increase the count to 1
            }
            else if(m==nums[i]){   //if count>0 then just compare the majority value with current value if it is equal then increase the count
                count++;
                
            }
            else{
                count--;  //Otherwise decrease the count
            }
        }
        return m;   // finally whatever element assigned to m just print it.
  }
    }
