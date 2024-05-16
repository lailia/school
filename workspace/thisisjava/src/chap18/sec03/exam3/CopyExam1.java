package chap18.sec03.exam3;

import java.io.*;

public class CopyExam1 {

	public static void main(String[] args) throws Exception{
		String originalFileName = "C:/Temp/apple.jpg";
		String targetFileName = "C:/Temp/apple2.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];	//읽은 바이트를 저장할 배열 생성
		while(true) {
			int num = is.read(data);
			//최대 1024바이트를 읽고 배열에 저장
			if(num == -1) break;	//파일을 다 읽으면 while문 종료
			os.write(data, 0, num);	//읽은 바이트 수만큼 출력
		}
		
		os.flush();	//내부 버퍼잔류 바이트를 출력하고, 버퍼를 비움
		os.close();

		is.close();
		
		System.out.println("복사가 잘 되었습니다");

	}

}
