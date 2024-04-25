package chap12.sec8;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExam1 {

	public static void main(String[] args) {
		//Date 클래스 : 날짜 표현 클래스로 객체간에 날짜 정보를 주고받을수 있음
		//Date()생성자 : 컴퓨터의 현재 날짜를 읽어서 Date 객체로 만듦
		Date now = new Date();
		String str = now.toString();
		System.out.println(str);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String str2 = sdf.format(now);
		System.out.println(str2);
		//SimpleDateFormat은 날짜를 형식화된 문자열로 변화하는 기능을 지님
		//format메소드로 날짜를 제공하면 패턴과 동일한 문자열을 얻음

	}

}
