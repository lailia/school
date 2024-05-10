package chap17.sec01.exam1;

import java.util.*;
import java.util.stream.Stream;

public class StreamExam1 {

	public static void main(String[] args) {
		//Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김길동");
		set.add("강길동");
		
		//Stream을 이용한 요소 반복 처리
		Stream<String> stream = set.stream();	//스트림 얻기
		stream.forEach(name -> System.out.println(name));
		//람다식 : Stream 요소 처리 방법

	}

}
