public class MyClass {
    public static void main(String args[]) {
        int N=5;
        System.out.println(oddEven(N));
    }
    static String oddEven(int N){
        if(N>=1){
            if(N%2==0){
                return "even";
             }
            else{
            
                return "odd";
              }
        }
            return "null";
             
    }
}
