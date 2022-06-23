import java.util.*;
import java.lang.*;
public class Solution {
  public static void main(String args[]){
    int[] nums={2,7,11,19};
    int target=9;
    System.out.println(Arrays.toString(twoSum(nums,target)));
}
    public static int[] twoSum(int[] nums, int target) {
        int[] matched=new int[2];
       // int j=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                       matched[0]=i;
                       matched[1]=j;
            }   
            }
        
        } 
        return matched;
        
    }
}
