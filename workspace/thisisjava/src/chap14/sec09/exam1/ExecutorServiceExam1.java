package chap14.sec09.exam1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExam1 {

	public static void main(String[] args) {
		//스레드 풀 생성(최대 5개의 스레드 운영)하고 종료
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		//스레드 풀 종료
		executor.shutdownNow();
		//shutdownNow()는 남아있는 작업과 상관없이 강제 종료함

	}

}