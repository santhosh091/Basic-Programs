package ganesh;

import java.util.Scanner;

public class PalindromeAnother {
	
	static int palindromeOrNot(int num){
		int sum=0;
		int r;
		while(num!=0){
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the any Number");
		int n = ip.nextInt();
		
		int t=n;
		int s;
		s = palindromeOrNot(n);
		if(s==t){
			System.out.println(t+"is a Palindrome Number");
			}
		else{
			System.out.println(t+"is a Not Palindrome Number");
		}
		ip.close();
	}
}