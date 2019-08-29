package ganesh;
import java.util.*;
public class MissingNumberInArray {
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int val = ip.nextInt();
		int a[]=new int[val];
		
		System.out.println("Enter the elements");
		for(int k=0;k<a.length;k++)
		{
			a[k]=ip.nextInt();
		}
		
		
		for(int i=0; i<a.length-1; i++){
			if((a[i+1]-a[i])!=1){
			System.out.println("The Missing element in array 'a' is  "+(a[i]+1));
		}
	  }
   }
}