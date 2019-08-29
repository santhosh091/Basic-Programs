package ganesh;

import java.util.Scanner;

public class PerfectNumer {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=ip.nextInt();
	
		int sum=0;
		for(int i=1; i<=a/2; i++){
			if(a%i==0){
				System.out.print(i+"+");
				sum=sum+i;
			}
		}
			if(sum==a){
				System.out.println("\n "+a+"="+"Perfect Number");
			}
			else{
				System.out.println(" "+a+"="+"Not Perfect Number");
		}
		ip.close();
	}
}