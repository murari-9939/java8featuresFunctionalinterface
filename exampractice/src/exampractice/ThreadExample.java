package exampractice;
class Xyz extends Thread{
	@Override
	public void run() {
		System.out.println("thread started");
		for(int i = 1; i <= 10 ; i++) {
			
		}
		System.out.println("thread end");
	}
	
}
public class ThreadExample {
	public static void main(String[] args) {
		Xyz p = new Xyz();
		p.start();
		System.out.println("Program end");
		
	}

}
