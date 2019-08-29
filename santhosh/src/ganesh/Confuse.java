package ganesh;

public class Confuse {
	int c =1;
	{
	c=2;	
	
	}
	Confuse(int c){
		this.c=c;
	}
	public static void main(String[] args) {
		Confuse obj = new Confuse(3);
		System.out.println(obj.c);
	}
	

}
