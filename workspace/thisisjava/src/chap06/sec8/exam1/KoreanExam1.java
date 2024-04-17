package chap06.sec8.exam1;

public class KoreanExam1 {

	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "자바");
		
		System.out.println("나라 : " + k1.nation);
		System.out.println("주민번호 : " + k1.ssn);
		System.out.println("이름 : " + k1.name);
		
		//k1.nation = "캐나다";	//final 필드는 값을 변경할 수 없음
		//k1.ssn = "123456-7894234";	//초기값이 들어간 final 필드는 값을 변경할 수 없음
		k1.name = "JAVA";	//비 final 필드는 값 변경 가능
		System.out.println(k1.name);

	}

}
