package chap09.sec06.exam3;

public class Button {
	//중첩 인터페이스 선언
	//정적 멤버 인터페이스
	public static interface ClickListener{
		//추상 메소드
		void onClick();
		
	}
	
	private ClickListener clickListener;
	
	public void setClick(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	//Button이 클릭되었을때 실행하는 메소드 선언
	public void click() {
		this.clickListener.onClick();
		
	}
}
