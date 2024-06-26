package chap09.sec07.exam3;

public class ButtonExam1 {

	public static void main(String[] args) {
		//Ok버튼 객체 생성
		Button btnOk = new Button();
		//Ok버튼 객체에 ClickListener 구현 객체를 주입
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 클릭했습니다");
				
			}
		});
		//Ok버튼 출력
		btnOk.click();
		
		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다");
				
			}
		});
		
		btnCancel.click();
		
	}

}
