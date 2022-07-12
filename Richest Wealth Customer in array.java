class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0 ;    //this is for rows
            for(int j=0;j<accounts[i].length;j++){ //this is for columns in particular row.
                sum=sum+accounts[i][j];
            }
            if(sum>max){
               max=sum;
            }
        }
        return max;
        }
            
        
    }
    
