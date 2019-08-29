package ganesh;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the word");
		String s1 = ip.next();
		System.out.println("Enter the word");
		String s2 = ip.next();
		
		boolean anagram = false;
		if(s1.length()!=s2.length()){
			System.out.println("Not Anagram");
		}
		else{
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			
			for(int j=0; j<c1.length; j++){
				for(int i=0; i<c2.length; i++){
					if(c1[j]==c2[i]){
						anagram=true;
					}
				}
			}
			if(anagram==false){
				System.out.println("Not Anagram");
			}
			else{
				System.out.println("Anagram");
			}
		}
		ip.close();
	}
}