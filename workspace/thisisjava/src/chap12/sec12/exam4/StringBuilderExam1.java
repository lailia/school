package chap12.sec12.exam4;

public class StringBuilderExam1 {

	public static void main(String[] args) {
		String str = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 100; i++) {
			str = sb.append(i + " ").toString();
		}
		
		System.out.println(str);

	}

}
