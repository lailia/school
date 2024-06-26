package chap12.sec8;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAnglesExam1 {

	public static void main(String[] args) {
		//Calendar 크래스의 오버로딩된 다른 getInstance()메소드를 이용
		//미국/로스엔젤레스와 같은 다른 시간대의 Calendar를 얻음
		//=>알고 싶은 시간대의 TimeZone 객체를 얻어서
		//getInstance() 메소드의 매개값으로 넘겨주면 됨
		TimeZone timezon = TimeZone.getTimeZone("America/New_York");
		Calendar now = Calendar.getInstance(timezon);
		int amPm = now.get(Calendar.AM_PM);
		String strAP = null;
		if(amPm == Calendar.AM) {
			strAP = "오전";
		}
		else {
			strAP = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);	//시를 리턴
		int minute = now.get(Calendar.MINUTE);	//분을 리턴
		int second = now.get(Calendar.SECOND);	//초를 리턴
		
		System.out.print(strAP + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");

	}

}
