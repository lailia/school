package chap17.sec07.exam1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExam1 {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 60));
		studentList.add(new Student("김길동", 50));
		studentList.add(new Student("이길동", 70));
		studentList.add(new Student("박길동", 90));
		studentList.add(new Student("강길동", 80));
		
		//점수를 기준으로 오름차순 정렬(sorted())한 새 스트림 얻기
		studentList
		.stream()
		.sorted()
		.forEach(s -> System.out.println("이름 : " + s.getName() + ", 점수 : " + s.getScore()));
		System.out.println();
		
		//내림차순 정렬 : Comparator.reverseOrder()
		studentList
		.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println("이름 : " + s.getName() + ", 점수 : " + s.getScore()));

	}

}
