package chap04.sec5;

import java.util.Scanner;

public class DoWhileExam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = new String();
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");

		do {
			System.out.print(">>> ");
			
			str = scan.nextLine();
			
			System.out.println("메세지 : " + str);
			
		} while(!str.equals("q"));
		
		System.out.println("do ~ while 문장 종료");
		
	}

}
