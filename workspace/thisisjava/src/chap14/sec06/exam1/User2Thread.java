package chap14.sec06.exam1;

public class User2Thread extends Thread{
	private Calculator calculator;	//필드 선언
	
	public User2Thread() {
		setName("User2Thread");	//스레드 이름 변경
	}
	
	public void setCalculator(Calculator calculator) {
		//외부에서 공유객체인 Calculator 를 받아 필드에 저장
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(150);	//동기화 블록을 가진 메소드 호출
	}

}
