package chap15.sec03.exam3;

import java.util.*;

public class HashSetExam1 {

	public static void main(String[] args) {
		// iterator() : 반복자를 얻어 Set 컬렉션의 객체를 하나씩 가져옴
		//hasNext() : 가져올 객체가 있으면 true를 리턴하고, 없으면 false 리턴
		//next() : 컬렉션에서 하나의 객체를 가져옴
		//remove() : next()로 가져온 객체를 제거
		
		//HashSet 커렉션 객체 생성
		Set<String> set = new HashSet<>();
		
		//객체 추가
		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("SPRING");
		
		//객체를 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			//객체를 하나 가져오기
			String element = iterator.next();	//하나의 객체를 가져옴
			System.out.println(element);
			if(element.equals("JSP")) {
				iterator.remove();	//가져온 객체를 제거함
			}
		}
		System.out.println();
		
		//객체를 하나씩 가져와서 처리함
		for(String element : set) {
			System.out.println(element);
		}

	}

}
