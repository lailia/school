package chap18.sec12.exam10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			//경로 입력받기
			System.out.println("원본 파일 경로 : ");
			String originPath = scanner.nextLine();
			
			System.out.println("복사 파일 경로 : ");
			String targetPath = scanner.nextLine();
			
			//원본 파일 존재 여부 확인
			File originFile = new File(originPath);
			if(!originFile.exists()) {
				System.out.println("원본 파일이 존재하지 않습니다");
				System.exit(0);
			}
			
			//복사 파일 경로상에 없는 모든 디렉토리 생성
			File targetFile = new File(targetPath);
			File parentFile = targetFile.getParentFile();
			if(!parentFile.exists()) {
				parentFile.mkdirs();
			}
			
			//입출력 스트림 얻기 
			BufferedInputStream bis = new BufferedInputStream(
			new FileInputStream(originPath));
			BufferedOutputStream bos = new BufferedOutputStream(
			new FileOutputStream(targetPath));
			
			//파일 데이터를 읽고 출력하기
			byte[] data = new byte[1024];
			int num = -1;
			while(true) {
				num = bis.read(data);
				if(num == -1) break;
				bos.write(data, 0, num);
			}
			System.out.println("복사가 성공되었습니다.");
			
			//입출력 스트림 닫기
			bis.close();
			bos.close();
		}catch(IOException e) {e.printStackTrace();}

	}

}
