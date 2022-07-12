class Solution {
  public static void main(String args[]){
  int[] nums={3,6,9,1};
  System.out.println(maximumGap(nums));
  }
    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);                          // Array is sorted now.
        if(nums.length<2){ //checking whether the number of elements are less than 2 or not
              return 0;   //if yes then return 0.
        }
        int maxDif=0;   //taking initial value of maxDif is 0
        //int l=0
        for(int k=0; k<nums.length-1;++k){  //taking upto 2nd element from last index.
            // ++l;
                if((nums[k+1]-nums[k])>maxDif){  //Checking successive elements difference                                                              //is greater than maxDif
                    maxDif=nums[k+1]-nums[k];   //if yes then assign the value of difference
                }
           
            }
            
            return maxDif;  //finally print the maxDifference value in an array.
    }
}
