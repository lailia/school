package chap09.sec06.exam2;

public class Button {
	//중첩 인터페이스 선언
	//정적 멤버 인터페이스
	public static interface ClickListener{
		//추상 메소드
		void onClick();
		
	}
	
	//중첩 인터페이스 타입으로 필드와 setter를 선언
	//필드 선언
	private ClickListener click;
	//setter 선언
	public void setClick(ClickListener click) {
		this.click = click;
	}
}
