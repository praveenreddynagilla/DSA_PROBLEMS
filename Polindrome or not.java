class Solution {
  public static void main(String args[]){
     System.out.println(isPalindrome(121);
                        }
    public static boolean isPalindrome(int x) {
        int rem;
        int sum=0;
        int temp=x;
        while(x>0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
            
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
    }
}
