package chap17.sec06.exam1;

import java.util.ArrayList;
import java.util.List;

public class MapExam1 {

	public static void main(String[] args) {
		//List 커렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		//mapToInt 요소를 다른 요소로 변환한 새로운 스트림을 리턴
		//Student를 score 스트림으로 변환
		studentList.stream()
				   .mapToInt(s -> s.getScore())
				   .forEach(score -> System.out.println(score));
		//Student 스트림을 score 스트림으로 변환하고 점수를 콘솔에 출력함

	}

}
