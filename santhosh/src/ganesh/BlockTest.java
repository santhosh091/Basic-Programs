package ganesh;

public class BlockTest {
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("init block");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BlockTest b=new BlockTest();
	new BlockTest();
	}

}
