package chap12.sec3.exam5;

public class ErrExam1 {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("1oo");
		}catch(NumberFormatException e) {
			System.err.println("[에러 내용]");
			System.err.println(e.getMessage());
			//err필드 : 콘솔에 에러 내용을 빨간색으로 출력함
		}

	}

}
