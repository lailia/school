package chap14.sec10.exam03;

public class ThreadExam1 {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.setDaemon(true);
		thread.start();
		
		try {Thread.sleep(3000);}
		catch(InterruptedException e) {}
	}

}
