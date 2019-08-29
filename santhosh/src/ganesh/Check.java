package ganesh;
class CheckA{
	static int a=1;
	void disp(){
		System.out.println(a);
	}
}
class CheckB extends CheckA{
	static int a=2;
	static void display(){
		System.out.println(CheckA.a+CheckB.a);
		//this and super only access instance variable 
		//static method does not access instance variable
		//final method can not override
	}
}
public class Check {

	public static void main(String[] args) {
		CheckB b = new CheckB();
		b.disp();
		//b.display();
		CheckB.display();

	}

}
