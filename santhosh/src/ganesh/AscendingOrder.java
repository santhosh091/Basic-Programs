package ganesh;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int n = ip.nextInt();
		
		int a[] = new int [n];
		for(int i=0; i<a.length; i++){
			System.out.println("Enter Element At"+" "+i+" "+"Index");
			a[i] = ip.nextInt();
		}
		int temp=0;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		ip.close();
	}
}