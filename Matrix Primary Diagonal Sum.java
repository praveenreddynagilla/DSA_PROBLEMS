import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int[][] arr=new int[M][M];
		for(int i=0;i<M;i++){
		    for(int j=0;j<M;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int ans=0;
		for(int i=0;i<M;i++){
		    for(int j=0;j<M;j++){
		        if(i==j){
		        ans=ans+arr[i][j];
		    }
		}
		}
		
		System.out.println(ans);
		}
}
