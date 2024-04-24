package chap12.sec5;

public class StringBuilderExam1 {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")	//문자열 끝에 추가
				.insert(0, "ABC")	//문자열을 지정위치에 추가
				.delete(3, 4)	//3번 인덱스 삭제(D 삭제)
				.replace(0, 1, "12")	//0번 인덱스를 "12"로 교체
				.toString();
		//StringBuilder()클래스에서는 메소드 체이닝 패턴을 사용함
		//StringBuilder가 제공하는 조작메소드는 StringBuilder를
		//다시 리턴하기 때문에 연이어서 다른 메소드를 호출할 수 있는
		//메소드 체이닝 패턴을 사용할 수 있음
		
		System.out.println(data);

	}

}
