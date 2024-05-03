package chap14.sec05.exam2;

public class JoinExam1 {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();	//SumThread()객체 생성
		sumThread.start();	//생성된 작업 스레드(SumThread())의 run()메소드를 실행
		
		try {
			sumThread.join();
			//sumThread가 종료할때까지 mainThread는 일시정지
		}
		catch(Exception e) {}
		System.out.println("1~100 합계 : " + sumThread.getSum());

	}

}