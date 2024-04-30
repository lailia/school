package chap14.sec06.exam2;

public class WaitNotifyExam1 {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();	//공유 작업 객체 생성
		
		ThreadA threadA = new ThreadA(workObject);	//A작업 스레드 생성
		ThreadB threadB = new ThreadB(workObject);	//B작업 스레드 생성
		
		threadA.start();
		threadB.start();

	}

}
