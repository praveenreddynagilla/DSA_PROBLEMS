public class MyClass {
    public static void main(String args[]) {
        int[] arr={1,3,5,4,10,9,45};         //taking an array(un-sorted array)
        int target=9;                        //giving a target to find its index value
        int ans=linear_Search(arr,target); 
        System.out.print(ans);
      
    }
    static int linear_Search(int[] arr,int target){
        for(int index=0;index<arr.length;index++){              //O(n) is the complexity
            if(arr[index]==target){                            // if equal just return  the index
                return index;
            }
            
        }
        return -1;              //if not found then return -1
        
    }
}
