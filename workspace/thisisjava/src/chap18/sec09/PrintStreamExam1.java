package chap18.sec09;

import java.io.*;

public class PrintStreamExam1 {

	public static void main(String[] args) throws Exception{
		//FileOutputStream에 PrintStream 보조스트림을 연결해서 문자열을 출력
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다");
		ps.printf("| %6d | %-10s | %10s | \n", 1, "홍길동", "도적");
		ps.printf("| %6d | %-10s | %10s | \n", 2, "이길동", "개발자");

	}

}
