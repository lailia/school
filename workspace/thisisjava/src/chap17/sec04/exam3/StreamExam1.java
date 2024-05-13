package chap17.sec04.exam3;

import java.util.stream.IntStream;

public class StreamExam1 {

	public static int sum = 0;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		//rangeClosed(1, 100) : 1~100범위 (끝수 포함) 정수 스트림 얻기
		//range(1, 100) : 1~99범위 (끝수 포함 안함) 정수 스트림 얻기
		stream.forEach(a -> sum += a);
		System.out.println("총합 : " + sum);

	}

}
