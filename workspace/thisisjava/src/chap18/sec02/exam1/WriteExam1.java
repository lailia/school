package chap18.sec02.exam1;

import java.io.*;

public class WriteExam1 {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/tet1.db");
			//데이터 도착지를 test1.db 파일로 하는 바이트 출력 스트림 생성
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);	//1byte씩 출력
			os.write(b);
			os.write(c);
			os.flush();	//내부 버퍼에 잔류하는 바이트를 출려하고 버퍼를 비움
			os.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
