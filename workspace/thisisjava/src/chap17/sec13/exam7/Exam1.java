package chap17.sec13.exam7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam1 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));
		
		List<Member> developers = list.stream()
								  .filter(s -> s.getJob().equals("개발자"))
								  .collect(Collectors.toList());
		
		developers.stream()
		.forEach(s -> System.out.println(s.getName()));

	}

}
