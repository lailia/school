package chap09.Exam2;

public class ActionExam1 {

	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다");
			}
		};
		
		action.work();

	}

}