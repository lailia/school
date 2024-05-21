package chap17.sec04.exam2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam1 {

	public static void main(String[] args) {
		//문자열 배열과 정수 배열로부터 스트림을 얻음
		String[] strArray = {"홍길동", "강길동", "이길동"};
		Stream<String> stream = Arrays.stream(strArray);
		
		stream.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5,6,7};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item + ", "));

	}

}