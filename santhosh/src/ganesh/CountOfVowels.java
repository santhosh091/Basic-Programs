package ganesh;

import java.util.Scanner;

public class CountOfVowels {
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the word");
		String a=ip.next();
		System.out.println("Enter the vowels");
		String b=ip.next();
		int count=0;
		
		char[] b1=a.toCharArray();
		char[] a1=b.toCharArray();
		for(int i=0; i<a1.length; i++){
			for(int j=0; j<b1.length; j++){
				if(a1[i]==b1[j]){
					count++;
				}
			}
			System.out.println(a1[i]+"--->"+count);
			count=0;
		}
		ip.close();
	}
}