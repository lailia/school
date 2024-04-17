package chap05.sec4;

public class EqualsExam1 {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음");
		}
		else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 내용이 같음");
		}
		else {
			System.out.println("str1과 str2는 내용이 다름");
		}
		
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		System.out.println(str3);
		System.out.println(str4);
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 참조가 같음");
		}
		else {
			System.out.println("str3과 str4는 참조가 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 내용이 같음");
		}
		else {
			System.out.println("str3과 str4는 내용이 다름");
		}

	}

}
