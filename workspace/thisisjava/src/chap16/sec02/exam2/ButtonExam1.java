package chap16.sec02.exam2;

public class ButtonExam1 {

	public static void main(String[] args) {
		// Ok 버튼 객체 생성
		Button btnOK = new Button();
		
		btnOK.setClickListener(() -> {
			//매개값으로 람다식을 대입
			System.out.println("OK 버튼을 클릭 했습니다.");
		});
		
		btnOK.click();
		
		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(() -> {
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		
		btnCancel.click();

	}

}
