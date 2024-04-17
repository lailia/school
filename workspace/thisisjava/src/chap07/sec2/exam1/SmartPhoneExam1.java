package chap07.sec2.exam1;

public class SmartPhoneExam1 {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone phone = new SmartPhone("갤럭시", "검정");
		
		//Phone 으로부터 상속받은 필드 읽기
		System.out.println("모델 : "+ phone.model);
		System.out.println("색상 : "+ phone.color);

	}

}
