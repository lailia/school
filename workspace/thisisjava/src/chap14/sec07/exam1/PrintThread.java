package chap14.sec07.exam1;

public class PrintThread extends Thread{
	private boolean stop;	//기본값 false
	
	public void setStop(boolean stop) {
		//외부에서 stop 필드값을 변경 할 수 있도록 선언함
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			//stop필드 값에 따라 반복 여부 결정(stop = false면 조건식이 true가 되어 계속 반복)
			System.out.println("실행중 ");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
		
	}

}
