public class Solution {
    public static void main(String args[]){
        int[] nums={1,2,3,4,1};
        System.out.println(containsDuplicate(nums));
    }
    public static  boolean containsDuplicate(int[] nums) {
       for(int i=1;i<nums.length;i++){
           for(int j=0;j<i;j++){
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
} 
