package chap14.sec07.exam3;

public class PrintThread extends Thread{
	
	@Override
	public void run() {
		//Thread.interrupted() 를 사용해서 interrupt()메소드가 호출 되었는지
		//확인한 후 ==> while문을 빠져나가도록 함
		
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
				//interrupt()메소드가 호출되었다면 true가 되어 break문이 실행됨
				//==> while문을 빠져나감
			}
		}
		
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
	
}