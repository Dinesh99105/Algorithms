import java.util.*;
import java.lang.*;
import java.io.*;

class Rearrangment {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T>0){
		    
		    
		    //int z=0;
		    int N = scan.nextInt();
		    int i;
		    int max_index=N-1;
		    int min_index=0;
		    //int x=N-1;
		    long [] arr = new long [N];
		    //int [] prr = new int [N];
		    for(i=0;i<N;i++){
		        arr[i]=scan.nextLong();
		    }
		    long max_element=arr[N-1]+1;
		   /* for(i=0;i<N;i++){
		    if(i%2==0){
		        prr[i] = arr[x];
		        x=x-1;
		    }
		    else{
		        prr[i]=arr[z];
		        z=z+1;
		    }
		    }*/
		    
		    for(i=0;i<N;i++){
		        if(i%2==0){
		            arr[i]+=(arr[max_index]%max_element)*max_element;
		            max_index--;
		        }
		        else{
		            arr[i]+=(arr[min_index]%max_element)*max_element;
		            min_index++;
		        }
		    }
		    for(i=0;i<N;i++){
		        arr[i]=arr[i]/max_element;
		    }

		    for(i=0;i<N;i++){
		    System.out.print(arr[i]+" ");
		    }
		    
		   T--;
		   System.out.println();
		}
	
	}
}
