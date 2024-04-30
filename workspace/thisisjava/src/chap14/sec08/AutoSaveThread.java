package chap14.sec08;

public class AutoSaveThread extends Thread{
	
	public void save() {
		System.out.println("작업 내용 저장");
	}
	//1초 주기로 save() 메소드를 호출하는 AutoSaveThread를 데몬스레드로 실행시킴
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
}
