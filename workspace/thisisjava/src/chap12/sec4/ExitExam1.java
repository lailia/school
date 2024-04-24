package chap12.sec4;

public class ExitExam1 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				//JVM 프로세스 강제 종료
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}

	}

}
