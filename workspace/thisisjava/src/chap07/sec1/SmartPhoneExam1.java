package chap07.sec1;

public class SmartPhoneExam1 {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone sp = new SmartPhone("갤럭시", "검정");
		
		//Phone(상속받은 부모 클래스)으로부터 상속받은 필드 읽기
		System.out.println("모델 : " + sp.model);
		System.out.println("색상 : " + sp.color);
		
		//Phone(상속받은 부모 클래스)으로부터 상속받은 메소드 읽기
		sp.bell();
		sp.sendVoice("ㅎㅇ");
		sp.receiveVoice("Hello");
		sp.hangup();
		
		//SmartPhone 메소드 호출
		sp.setWifi(false);
		sp.setWifi(true);
		
		sp.internet();

	}

}
