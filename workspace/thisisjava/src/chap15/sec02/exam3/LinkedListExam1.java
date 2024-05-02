package chap15.sec02.exam3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam1 {

	public static void main(String[] args) {
		//ArrayList 객체 생성
		List<String> list1 = new ArrayList<>();
		
		//LinkedList 객체 생성
		List<String> list2 = new LinkedList<>();
		
		//변수 선언
		long startTime;	//시작 시간
		long endTime; 	//종료 시간
		
		//ArrayList 객체 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(i, String.valueOf(i));	//주어진 인덱스에 객체를 추가
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간", (endTime-startTime));

		//LinkedList 객체 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(i, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간", (endTime-startTime));

	}

}
