package exampractice;
class ab{
	void eat() {
		System.out.println("hello");
	}
}
class bn extends ab{
	void dp() {
		System.out.println("mkpp");
		super.eat();
	}
}

public class e6 {
	public static void main(String[] args) {
		bn k =new bn();
		k.dp();
		
	}

}
