package chap06.sec4.exam2;

public class KoreanExam1 {

	public static void main(String[] args) {	//실행 클래스
		//Korean 객체 생성
		Korean k1 = new Korean("asd", "qqqwe");
		
		//Korean 객체 데이터 읽기
		System.out.println("nation : " + k1.nation);
		System.out.println("name : " + k1.name);
		System.out.println("ssn : " + k1.ssn);
		System.out.println();
		
		//또 다른 Korean 객체 생성
		Korean k2 = new Korean("czxc", "011");
		
		System.out.println("nation : " + k2.nation);
		System.out.println("name : " + k2.name);
		System.out.println("ssn : " + k2.ssn);
		System.out.println();
		
		Korean k3 = new Korean("일본", "qwezac", "03149");
		
		System.out.println("nation : " + k3.nation);
		System.out.println("name : " + k3.name);
		System.out.println("ssn : " + k3.ssn);

	}

}
