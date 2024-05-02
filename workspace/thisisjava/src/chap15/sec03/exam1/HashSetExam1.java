package chap15.sec03.exam1;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam1 {

	public static void main(String[] args) {
		// Set 컬렉션은 저장 순서가 유지되지 않음
		// Set 컬렉션은 중복 저장할 수 없음
		// HashSet 컬렉션 생성
		Set<String> set = new HashSet<>();
		
		//객체 저장 : add()
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		//저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수 : " + size);

	}

}
