package chap17.sec12.exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam1 {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("홍길순", "여", 87));
		totalList.add(new Student("이길동", "남", 95));
		totalList.add(new Student("이길순", "여", 93));
		
		//남학생만 묶어 List 생성
		List<Student> maleList1 = totalList.stream()
								  .filter(s -> s.getS().equals("남"))
								  .collect(Collectors.toList());
		
		//Student 스트림에서 남학생만 필터링해서 별도의 List로 생성함
		//Stream의 collect(Collector<T,A,R> collector) 메소드는 필터링 또는
		//매핑된 요소들을 새로운 컬렉션에 수집하고, 이 컬렉션을 리턴
		
		maleList1.stream()
		.forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		//여학생만 묶어 List 생성(toList() 사용)
		List<Student> maleList2 = totalList.stream()
								  .filter(s -> s.getS().equals("여"))
								  .toList();
		//요소 스트림에서 toList() 메소드를 사용해서 List컬렉션을 얻음
		
		maleList2.stream()
		.forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		//학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
								   .collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
		System.out.println(map);
								   

	}

}
