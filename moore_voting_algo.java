import java.util.*;
import java.lang.*;
import java.io.*;

class moore_voting_algo {
    
    int findCandidate(int arr[],int size){
        int maj_i=0;
        int i;
        int count=1;
        for(i=1;i<size;i++){
            if(arr[maj_i]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maj_i=i;
                count=1;
            }
        }
        return arr[maj_i];
    }
    
    boolean IsMajority(int arr[],int size,int cand){
        int i;
        int count=0;
        for(i=0;i<size;i++){
            if(cand==arr[i]){
                count++;
            }
            
        }
        if(count>size/2)
              {return true;}
        else
             { return false;}
    }
    
    void printMajority(int arr[],int size){
        int cand = findCandidate(arr,size);
        if(IsMajority(arr,size,cand)){
            System.out.println(cand);
        }
        else{
            System.out.println(-1);
        }
    }
    
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T>0){
		    
		    
		    
		    int N = scan.nextInt();
		    int [] arr = new int[N];
		    for(int i=0;i<N;i++){
		        arr[i]= scan.nextInt();
		    }
		    
		    int size=N;
		    
		    moore_voting_algo gfg = new moore_voting_algo();
		    gfg.printMajority(arr,size);
		     
		   
		   T--; 
		}
	}
}
