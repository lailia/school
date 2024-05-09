package chap16.sec02.exam2;

public class Button {
	//정적 중첩 인터페이스
	@FunctionalInterface
	public static interface ClickListener{	//함수형 인터페이스
		void onClick();
	}
	
	private ClickListener clickListener;	//필드 선언
	
	//메소드 선언
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}

}
