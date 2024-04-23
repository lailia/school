package chap11.sec5;

public class ThrowsExam1 {

	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("예외 처리 : " + e.toString());
		}

	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
