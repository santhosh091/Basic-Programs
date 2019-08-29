package ganesh;

public class A {

	static int a = 1;
	static int b = 2;

	static int overloading(int a) {
		int x = a + b;
		System.out.println(x);
		return x;
	}

	final int overloading(int a, int b) {
		int x = b + a;
		System.out.println(x);
		return x;
	}

	void display() {

		for (int f = 1; f <= 4; f++) {
			if (f == 2) {
				continue;
			}
			System.out.println("f");
		}

	}

	public static void main(String[] args) {
		A.overloading(9);
		//B obj = new B(5.5);
        new B(5.5);
		new A().display();
	}
}

class B extends A {
	double c;
	int g;

	B(double c) {
		this.c = c;
		System.out.println(this.c);
		super.display();
	}

	B(double c, int g) {
		this.g = g;
		System.out.println(this.g);
	}

	void display() {
		int e = 5;

		while (e <= 5) {
			if (e == 5) {
				break;
			}
		}
		System.out.println("e");
	}
}
