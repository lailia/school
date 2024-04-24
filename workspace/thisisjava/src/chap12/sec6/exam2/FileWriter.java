package chap12.sec6.exam2;

import java.io.IOException;

public class FileWriter implements AutoCloseable{
	public FileWriter(String a) {
		System.out.println(a + "파일을 엽니다");
	}
	
	public void write(String a) {
		System.out.println(a + "를 파일에 저장합니다.");
	}

	@Override
	public void close() throws IOException {
		System.out.println("파일을 닫습니다");
	}

}
