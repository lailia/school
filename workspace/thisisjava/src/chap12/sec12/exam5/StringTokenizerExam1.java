package chap12.sec12.exam5;

import java.util.StringTokenizer;

public class StringTokenizerExam1 {

	public static void main(String[] args) {
		String str1 = "아이디,이름,패스워드";
		
		StringTokenizer st = new StringTokenizer(str1, ",");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
