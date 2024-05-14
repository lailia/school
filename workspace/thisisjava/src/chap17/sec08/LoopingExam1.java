package chap17.sec08;

import java.util.*;

public class LoopingExam1 {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		Arrays.stream(intArr)
		.filter(a -> a%2==0)
		.peek(n -> System.out.println(n));	//peek 중간 처리 메소드
		//peek는 최종 처리가 없으므로 동작 안함
		
		//중간처리 메소드 peek를 이용해서 반복 처리
		int total = Arrays.stream(intArr)
					.filter(a -> a%2==0)
					.peek(n -> System.out.println(n))	//중간처리 동작
					.sum();	//최종처리
		System.out.println("총합 : " + total);
		System.out.println();
		
		//최종 처리 메소드 forEach()를 이용해서 반복처리
		Arrays.stream(intArr)
		.filter(a -> a%2==1)	//1,3,5
		.forEach(n -> System.out.println(n));	//최종 처리 메소드이므로 잘 동작
		
	}

}
