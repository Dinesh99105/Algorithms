import java.util.*;
import java.lang.*;
import java.io.*;

class Kadane {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T>0){
		    int N = scan.nextInt();
		    int i;
		    
		    int []arr = new int[N];
		    for( i =0;i<N;i++){
		       arr[i]=scan.nextInt();
		    }
		    int maxs=arr[0];
		    int maxsfar=arr[0];
		    for(i=1;i<N;i++){
		           maxs=Math.max(arr[i],maxs+arr[i]);//maxs=maxs+arr[i];
		           /*if(ends<0){
		               ends=0;
		           }*/
		           /*else if(endsfar<ends){
		               endsfar=ends;
		           }*/
		           maxsfar=Math.max(maxs,maxsfar);
		        }
		        System.out.println(maxsfar);
		        
		        T--;
		    }
		    
		
	}
}
