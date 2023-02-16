package exampractice;
class XyzR implements Runnable{
	@Override
	public void run() {
		System.out.println("thread started");
		for(int i = 1; i <= 10 ; i++) {
			
		}
		System.out.println("thread end");
	}
	
}
public class ThreadExample2 {
	public static void main(String[] args) throws InterruptedException {
		XyzR p = new XyzR();
		XyzR p2 = new XyzR();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p2);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			//t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		System.out.println("Program end");
		
	}

}
