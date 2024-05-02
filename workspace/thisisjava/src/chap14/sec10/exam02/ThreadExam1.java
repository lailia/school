package chap14.sec10.exam02;

public class ThreadExam1 {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {}
		
		thread.interrupt();

	}

}
