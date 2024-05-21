package chap17.sec06.exam2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExam1 {
	
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
		.asDoubleStream()	//정수 스트림을 실수 스트림으로 변환
		.forEach(d -> System.out.println(d));
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		intStream
		.boxed()	//int ==> Integer 변환 (래퍼 객체 요소, 박싱)
		.forEach(d -> System.out.println(d));
	}

}