package chap17.sec06.exam3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExam1 {

	public static void main(String[] args) {
		//문장 스트림을 단어 스트림으로 변환고,
		//문자열 숫자 목록 스트림을 숫자 스트림으로 변환함
		
		//List 컬렉션 생성
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream()
		.flatMap(data -> Arrays.stream(data.split(" ")))
		//Arrays.stream() : 주어진 String[] 배열을 Stream<Sring> 으로 만듦
		//flatMap() 메소드 : 하나의 요소를 복수 개의 요소들로 변환한 새로운 스트림을 리턴
		.forEach(data -> System.out.println(data));
		
		System.out.println();
		
		List<String> list2 = Arrays.asList("10, 20, 30", " 40, 50");
		list2.stream()
		.flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<intArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
				//String[] 배열을 int[] 배열로 만듦
			}
			return Arrays.stream(intArr);
			//Arrays.stream() 메소드는 주어진 int[] 배열을 IntStream으로 만듦
		})
		.forEach(num -> System.out.println(num));

	}

}
