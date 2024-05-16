package chap18.sec04.exam2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExam1 {

	public static void main(String[] args) {
		try {
			Reader reader = null;
			reader = new FileReader("C:/Temp/Test1.txt");
			//텍스트 파일로부터 문자 입력 스트림 생성
			
			while(true) {
				int data = reader.read();	//1문자를 읽음
				if(data == -1) break;	//파일을 다 읽으면 while문 종료
				System.out.println((char)data);	//읽은 문자 출력
			}
			reader.close();
			System.out.println();
			
			//문자 배열로 읽기
			reader = new FileReader("C:/Temp/test1.txt");
			char[] data = new char[100];	//읽은 문자를 저장할 배열 생성
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
			reader.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
