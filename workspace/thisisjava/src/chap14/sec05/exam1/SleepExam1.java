package chap14.sec05.exam1;

import java.awt.Toolkit;

public class SleepExam1 {

	public static void main(String[] args) {
		//sleep() : 주어진 시간동안 스레드를 일시 정지 상태로 만듦
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i ++) {
			toolkit.beep();	//비프음 발생
			System.out.println("띵");
			try {
				Thread.sleep(3000);	//3초간 일시정지
			}
			catch(InterruptedException e) {}
		}

	}

}