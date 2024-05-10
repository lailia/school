package chap17.sec02;

import java.util.*;
import java.util.stream.Stream;

public class ParallelStreamExam1 {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김길동");
		list.add("강길동");
		list.add("이길동");
		list.add("조길동");
		list.add("박길동");
		
		//병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name + " : " + Thread.currentThread().getName());
		});

	}

}
