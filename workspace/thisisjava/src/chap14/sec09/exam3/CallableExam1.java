package chap14.sec09.exam3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExam1 {

	public static void main(String[] args) {
		//스레드 풀 생성(최대 5개의 스레드 운영)
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		//계산 작업 생성 및 처리 요청
		for(int i = 1; i <= 100; i++) {
			final int idx = i;
			Future<Integer> future = executor.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception{
					int sum = 0;
					for(int i = 1; i <= idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread();
					//어떤 스레드가 계산 처리를 했는지 알 수 있도록 출력
					System.out.println("["+thread.getName()+"] 1~"+idx+" 합 계산");
					return sum;	//작업 처리 결과를 리턴함
				}
			});
			try {
				int result = future.get();	//Callable의 Call()메소드가 리턴한 sum 값을 얻기
				System.out.println("\t 리턴값(sum) : " + result);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		//ExecutorService종료 작업(스레드 풀 종료)
		executor.shutdown();

	}

}
