package ganesh;
import java.util.*;
public class ReverseString {
	static String reverse(char[]c,int i,int j){
			while(i<j){
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = ip.nextInt();
		String[] s1=new String[a];
		for(int i=0;i<s1.length;i++){
			System.out.println("Enter the string:");
			s1[i]=ip.next();
		}

		for(int l=0;l<s1.length;l++){
		char c[]=s1[l].toCharArray();
		int s=0,k=0;
		for(; k<c.length-1; k++){
			if(c[k]=='.'){
				reverse(c,s,k-1);
				s=k+1;
				}
			}
		 
		reverse(c,s,k);
		reverse(c,0,c.length-1);
		
		String str=new String(c);
		System.out.println(str);
		}
		}
}