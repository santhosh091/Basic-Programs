package ganesh;

public class SmallestNumber {

	public static void main(String[] args) {
		int arr[]={6,10,6,10,5,5,10,5,10,5};
		int fr[]=new int[arr.length];
		
		int visited=-1;
		for(int i=0; i<arr.length; i++){
			int count=1;
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited){
				fr[i]=count;
			}
			System.out.println("---------");
			System.out.println("Element|Frequency");
			System.out.println("---------");
			for(int l=0; l<fr.length; l++){
				if(fr[l]!=visited){
					System.out.println(" "+arr[l]+"|"+fr[l]);
				}
				System.out.println("---------");
				for(int k=0; k<fr.length; k++){
					System.out.println(fr[k]+" ");
				}
				System.out.println(" ");
				int min=0;
				for(int p=0; p<arr.length; p++){
					if(fr[p]==fr[p+1]){
						if(arr[p]==arr[p+1]){
							min=arr[p];
						}
					}
				}
				System.out.println(min);
				for(int k=0; k<arr.length; k++){
					System.out.println(arr[k]+" ");
				}
			}
		}
	}
}
