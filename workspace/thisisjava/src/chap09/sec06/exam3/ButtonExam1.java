package chap09.sec06.exam3;

public class ButtonExam1 {

	public static void main(String[] args) {
		//Ok버튼 객체 생성
		Button btnOk = new Button();
		
		//Ok버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스
		class OkListener implements Button.ClickListener{
			
			@Override
			public void onClick() {
				System.out.println("OK버튼을 클릭했습니다");
			}
		}
		
		//Ok버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClick(new OkListener());
		
		//Ok버튼 클릭하기
		btnOk.click();
		
		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
		//Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel버튼을 클릭했습니다");
			}
			
		}
		
		//Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClick(new CancelListener());
		
		//Cancel 버튼 클릭하기
		btnCancel.click();

	}

}