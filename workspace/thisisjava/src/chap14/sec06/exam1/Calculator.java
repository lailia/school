package chap14.sec06.exam1;

public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
	
	//동기화 메소드(synchronized) :공유하는게 있으면 먼저 부른 스레드가 끝나면 다음 스레드 실행
	public synchronized void setMemory1(int memory) {
		this.memory = memory;	//메모리 값 저장
		try {Thread.sleep(2000);}	//2초간 일시 정지
		catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		//메모리 값 읽기
	}
	
	public void setMemory2(int memory) {
		//동기화 블럭 설정
		synchronized(this) {
			this.memory = memory;	//메모리 값 저장
			try {Thread.sleep(2000);}	//2초간 일시 정지
			catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
	}

}
