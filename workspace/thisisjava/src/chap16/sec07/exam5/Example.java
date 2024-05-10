package chap16.sec07.exam5;

public class Example {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setClickListener(() -> System.out.println("OK 버튼을 클릭했습니다"));
		btn.click();
		
		Button btnCan = new Button();
		btnCan.setClickListener(() -> System.out.println("Cancle 버튼을 클릭했습니다"));
		btnCan.click();

	}

}
