package chap17.sec07.exam2;

import java.util.ArrayList;
import java.util.List;

public class SortingExam1 {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 70));
		studentList.add(new Student("김길동", 60));
		studentList.add(new Student("강길동", 80));
		studentList.add(new Student("이길동", 90));
		//점수 ==> 오름차순 정렬
		studentList
		.stream()
		.sorted((s1,s2) -> Integer.compare(s1.getScore(), s2.getScore()))
		.forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
		System.out.println();
		//점수 ==> 내림차순 정렬
		studentList
		.stream()
		.sorted((s1,s2) -> Integer.compare(s2.getScore(), s1.getScore()))
		.forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
		
		//Student 클래스가 Comparable을 구현하고 있지 않기 때문에 비교자를 람다식으로 제공함

	}

}
