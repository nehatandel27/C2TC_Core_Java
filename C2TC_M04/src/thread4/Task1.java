package thread4;
// creating task1
public class Task1 implements Runnable {

	@Override
	public void run() {
		for(int i = 2; i<=5; i++) {
			System.out.println("i = "+i+ " , Name: " +Thread.currentThread().getName());
			try {
			Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
