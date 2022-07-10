class Solution {
  public static void main(String args[]){
  int[] nums={1,2,3,4};
  System.out.println(runningSum(nums));
  }
     public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
        
        
    }
}
