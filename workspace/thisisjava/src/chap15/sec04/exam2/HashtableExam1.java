package chap15.sec04.exam2;

import java.util.*;

public class HashtableExam1 {

	public static void main(String[] args) {
		// Hashtable 컬렉셔 생성
		Map<String, Integer> map = new Hashtable<>();
		
		//작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드는 기다림
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {}
		
		//저장된 엔트리 수 출력
		int size = map.size();
		System.out.println("총 엔트리 수 : " + size);

	}

}
