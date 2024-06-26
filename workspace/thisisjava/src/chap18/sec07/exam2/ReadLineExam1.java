package chap18.sec07.exam2;

import java.io.*;

public class ReadLineExam1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(
				new FileReader("src/chap18/sec07/exam2/ReadLineExam1.java")
				);
		//FileReader에 BufferedReader 보조 스트림 연결
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine();	//파일에서 1행씩 읽음
			if(str == null) break;	//더이상 읽을 행이 없으면 while문 종료
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}	
		
		br.close();
		//BufferReader를 닫으면 연결된 FileReader 닫힘

	}

}
