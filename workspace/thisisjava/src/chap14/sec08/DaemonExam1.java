package chap14.sec08;

public class DaemonExam1 {

	public static void main(String[] args) {
		AutoSaveThread thread = new AutoSaveThread();
		
		thread.setDaemon(true);
		//AutoSaveThread() 를 데몬 스레드로 만듦
		thread.start();
		
		try {
			Thread.sleep(3000);	//3초간 대기
		}
		catch(InterruptedException e) {	}
		//메인 스레드가 3초 후에 종료되면 AutoSaveThread도 자동으로 종료됨
		
		System.out.println("메인 스레드 종료");

	}

}