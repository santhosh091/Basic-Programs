package ganesh;

import java.util.*;

public class Missing {
	
	public static void main(String args[]){
	
		Scanner s =new Scanner(System.in);
	System.out.println("Enter the array length: ");
	int val=s.nextInt();
	int a[]=new int[val];
	for(int k=0;k<a.length;k++){
		a[k]=s.nextInt();
	}
	 int diff=0,missing=0;
	if(a[1]-a[0]==a[a.length-2]-a[a.length-1]){
		diff=a[1]-a[0];
	}
	else{
		diff=a[2]-a[1];
	}
	for(int j=a.length-1;j>=0;j--){
		if(a[j]-a[j-1]!=diff){
			missing=a[j]-diff;
			break;
		}
	}
	System.out.println("The number in array is: "+missing);
	}
}