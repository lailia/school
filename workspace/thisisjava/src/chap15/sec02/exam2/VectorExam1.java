package chap15.sec02.exam2;

import java.util.List;
import java.util.Vector;

import chap15.sec02.exam1.Board;

public class VectorExam1 {

	public static void main(String[] args) {
		//threadA, threadB에서 동시에 Board객체를 Vector에 각각 1000개씩
		//추가한 후, 전체 저장된 수를 출력
		
		//Vector 컬렉션 생성
		List<Board> list = new Vector<>();
		
		//작업 스레드 객체 생성 : threadA
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가 : add() 사용
				for(int i = 1; i <= 1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 객체 생성 : threadB
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가 : add() 사용
				for(int i = 1; i <= 1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될때까지 메인 스레드를 기다리게함
		try {
			threadA.join();	//threadA가 끝날때까지 메인 스레드는 기다림
			threadB.join();	//threadB가 끝날때까지 메인 스레드는 기다림
		}
		catch(Exception e) {}
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);

	}

}
