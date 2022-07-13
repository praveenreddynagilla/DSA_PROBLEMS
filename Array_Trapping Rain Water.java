public class MyClass {
    public static void main(String args[]) {
        int[] height={4,2,0,3,2,5};
        System.out.print(trap(height));
        } 
        
        public static int trap(int[] height) {
        int n=height.length;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        leftMax[0]=height[0];    // assigning values to leftMax array
        for(int i=1;i<n;i++){
           leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        rightMax[n-1]=height[n-1];   //Assigning values to rightMax array .
      //  int leftmax[0]=height[0];
        for(int i=n-2;i>=0;i--){
           rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int waterStored=0;    //taking initially waterStored as 0
        for(int i=0;i<n;i++){
            waterStored +=Math.min(leftMax[i],rightMax[i])-height[i];
        }
         return waterStored;   //total levels of waterStored in between buildings.
        
    
    
}
}
