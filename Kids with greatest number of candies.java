class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        ArrayList<Boolean> result=new ArrayList<Boolean>();  // defining the arraylist to return the result with boolean values.
        for(int i=1;i<candies.length;i++){ //finding the max value in an array
            if(candies[i]>max){
                max=candies[i]; 
            }
        }
        
        for(int j=0;j<candies.length;j++){
          //  result[j]=(candies[j]+extraCandies>=max)?true:false;
            if((candies[j]+extraCandies)>=max){  // checking the condition of ith has candies and extra candies is greater than the mex value 
                result.add(true);  // add true for that
            }
            else{
            result.add(false);  // otherwise add false for that
            }
            
        }
            return result;  // return the final list result.
            
        
    }


}
