package chap14.sec09.exam2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecutorExam1 {

	public static void main(String[] args) {
		//1000개의 Runnable을 생성한 다음 execute()메소드로 작업큐에 넣음
		//==> ExecutorService는 최대 5개 스레드로 작업 큐에서 Runnable을
		//하나씩 꺼내어 run()메소드를 실행하면서 작업을 처리함
		
		//1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i = 0; i < mails.length; i++) {
			mails[i][0] = "admin1@my.com";
			mails[i][1] = i+"";
			mails[i][2] = "admin3@my.com";
		}
		
		//ExecutorService 생성 : 스레드 풀 생성(최대 5개의 스레드 운영)
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		//이메일 보내는 작업 생성 및 처리 요청
		for(int i = 0; i < mails.length; i++) {
			final int idx = i;
			executor.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("["+thread.getName()+"] "+from+" ==> "+to+" : "+content);
					//어떤 스레드가 어떤 이메일을 처리했는지 알 수 있도록 출력
				}
			});
		}
		//ExecutorService 종료(스레드 풀 종료)
		executor.shutdown();
		//shutdown() : 현재 처리 중인 작업뿐만 아니라 작업 큐에 대기하고 있는 모든 작업을 
		//처리한 뒤에 스레드 풀을 종료시킴

	}

}
