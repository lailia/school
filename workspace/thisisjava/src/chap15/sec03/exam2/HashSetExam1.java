package chap15.sec03.exam2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam1 {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Member> set = new HashSet<>();
		
		//Member 객체 저장 : add() 사용
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길순", 30));
		set.add(new Member("홍길동", 30));	//동등 객체이므로 저장 X
		
		//저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());

	}

}
