package exampractice;
class Murari{
	int data=23;
	class Bha{
		void sum() {
			System.out.println(data);
		}
		
	}
}
public class nestedclass {
	public static void main(String[] args) {
		Murari kl = new Murari();
		
		Murari.Bha nkk =  kl.new Bha();
			nkk.sum();
		
	}

}
