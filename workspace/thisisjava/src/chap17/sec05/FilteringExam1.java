package chap17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExam1 {

	public static void main(String[] args) {
		//List 커렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권");
		list.add("신사임당");
		//중복 요소 제거
		list
		.stream()
		.distinct()	//중복된 요소 제거해주는 메소드
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		//필터링
		list
		.stream()
		.distinct()
		.filter(n -> n.startsWith("신"))		//"신"으로 시작하는 요소만 필터링
		.forEach(n -> System.out.println(n));
		//startsWith("문자열") : 주어진 문자열로 시작하면 true 리턴
			
	}

}