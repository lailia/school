package chap12.sec12.exam7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam1 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		
		String str1 = sdf.format(now);
		
		System.out.println(str1);
	
	}
}
