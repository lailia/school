package chap14.sec03.exam2;

import java.awt.Toolkit;

public class BeepPrintExam1 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			//익명 구현 객체를 아규먼트 객체로 받음
			//작업 스레드가 실행할 코드 부분
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}
					catch(Exception e) {}
				}
				
			}
		});
		thread.start();	//생성된 작업 스레드의 run()메소드를 실행
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}	//0.5초간 대기
			catch(Exception e) {}
		}

	}

}
