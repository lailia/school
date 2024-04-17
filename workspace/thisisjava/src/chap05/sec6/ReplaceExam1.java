package chap05.sec6;

public class ReplaceExam1 {

	public static void main(String[] args) {
		String oldStr = "자바 문자열은 String입니다";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println("old : " + oldStr);
		System.out.println("new : " + newStr);

	}

}
