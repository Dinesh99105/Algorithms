

import java.util.*;
import java.lang.*;
import java.io.*;

class Permutation {

    static List<String> prr = new ArrayList<String>();

    public void permute(String S,int l, int r){
        if(l==r){ 
            prr.add(S);
        }
        else{
            for(int i=l;i<=r;i++){
                S = swap(S,l,i);
                permute(S,l+1,r);
                S = swap(S,l,i);                
            }
        }
    }
    
    public String swap(String S,int i,int j){
        char temp;
        char[] arr = S.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
    
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T>0){
		    String S = scan.next();
		    int n = S.length();
		    Permutation obj = new Permutation();
		    obj.permute(S,0,n-1);
		    Collections.sort(prr);
		    String format = prr.toString().replace(",","").replace("[","").replace("]","");
		    System.out.print(format+" ");
		    System.out.println();
		    prr.clear();
		    T--;
		}
		
	}
}
