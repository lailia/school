package chap18.sec03.exam2;

import java.io.*;

public class ReadExam1 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/tet2.db");
			//데이터 출발지를 test2.db로 하는 입력 스트림을 생성
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				//최대 100byte를 읽고 읽은 바이트는 data에 저장
				System.out.println("num : " + num);
				if(num == -1) break;	//파일이 끝에 도달했을 경우
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);	//읽은 바이트(데이터) 출력
				}
			}
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
