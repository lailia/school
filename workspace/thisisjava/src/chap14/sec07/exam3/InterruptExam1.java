package chap14.sec07.exam3;

public class InterruptExam1 {

	public static void main(String[] args) {
		PrintThread thread = new PrintThread();
		
		thread.start();	
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {}
		
		thread.interrupt();	//interrupt() 메소드 호출

	}

}
