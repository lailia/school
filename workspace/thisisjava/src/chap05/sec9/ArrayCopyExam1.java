package chap05.sec9;

public class ArrayCopyExam1 {

	public static void main(String[] args) {
		String[] oldS = {"java", "array", "copy"};
		String[] newS = new String[5];
		System.arraycopy(oldS, 0, newS, 1, oldS.length);
		
		for(int i = 0; i < newS.length; i++) {
			System.out.print(newS[i] + ", ");
		}
		

	}

}
