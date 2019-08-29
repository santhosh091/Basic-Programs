package ganesh;

import java.util.Scanner;

public class NiveNumber {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int n = ip.nextInt();
		
		int a[] = new int [n];
		for(int i=0; i<a.length; i++){
			System.out.println("Enter Element At"+" "+i+" "+"Index");
			a[i] = ip.nextInt();
		}
		int temp;
		int sum=0;
		for(int i=0; i<a.length; i++){
			temp = a[i];
			while(temp>0){
				temp = temp%10;
				sum= sum + temp;
				temp = temp/10;
			}
			if(a[i]%sum==0){
				System.out.println(a[i]+"--->"+"Niven Number");
			}
			else{
				System.out.println(a[i]+"--->"+"Not Niven Number");
			}
		}
		ip.close();
	}
}