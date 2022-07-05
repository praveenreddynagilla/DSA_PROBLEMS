public class MyClass {
    public static void main(String args[]) {
        int[] nums={3,2,3,5,2,4,4};
        System.out.println(singleNumber(nums));
      
    }
    public static int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            
           
            }  
            if(count%2!=0){
                return nums[i];
             
            }
        }
        return -1;
        
    }
}
