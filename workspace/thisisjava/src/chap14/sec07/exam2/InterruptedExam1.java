package chap14.sec07.exam2;

public class InterruptedExam1 {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		
		printThread.start();
		
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {}
		
		printThread.interrupt();	//interrupt() 메소드 호출

	}

}
