package chap18.sec07.exam1;

import java.io.*;

public class BufferExam1 {

	public static void main(String[] args) throws Exception{
		//입출력 스트림 생성
		String path1 = BufferExam1.class
				.getResource("apple1.jpg").getPath();
		
		String targetFile1 = "C:/Temp/targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(targetFile1);
		
		//입출력 스트림 + 버퍼 스트림 생성
		String path2 = BufferExam1.class
				.getResource("apple2.jpg").getPath();
		
		String targetFile2 = "C:/Temp/targetFile2.jpg";
		
		FileInputStream fis2 = new FileInputStream(path2);
		FileOutputStream fos2 = new FileOutputStream(targetFile2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//버퍼 사용하지 않고 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용: \t" + nonBufferTime + "ns");
		
		//버퍼 사용하고 복사
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용: \t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();

	}
	
	public static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();	//시작 시간
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return end-start;
	}

}
