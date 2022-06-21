public class MyClass {
    public static void main(String args[]) {
        int[] arr={1,3,5,4,10,9,45,0,90};   //given un-sorted array
        
      min_And_Max(arr);
    }
    static void min_And_Max(int[] arr){
        int min=arr[0];         // just assuming first indexth value is min
        int max=arr[0];         // just assuming first indexth value is max
        for(int index=1;index<arr.length;index++){  
            if(arr[index]<min){          // compare the min value with every indexes and
                    min=arr[index];      //if the indexth value is less than min value then assign that value to min
            }
             if(arr[index]>max){         //compare the max value with every indexes 
                     max=arr[index];     //if the indexth value is less than min value then assign that value to max
            
             }   
            
        }          // after for loop execution print the min and max values as below
        System.out.print("min value is ="+min+"\nmax value is ="+max);
    }
}
