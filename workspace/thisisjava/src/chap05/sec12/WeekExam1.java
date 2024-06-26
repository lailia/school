package chap05.sec12;

import java.util.Calendar;

public class WeekExam1 {

	public static void main(String[] args) {
		Week today = null;	//Week 열거 타입 변수 선언
		Calendar cal = Calendar.getInstance();	//Calendar 열기
		
		int week = cal.get(Calendar.DAY_OF_WEEK);	//오늘의 요일 얻기(1 ~ 7)
		
		switch(week) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WEDNESDAY; break;
		case 5 : today = Week.THURSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		
		System.out.println("today : " + today);
		//열거 타입 변수 사용
		if(today == Week.SUNDAY) {
			System.out.println("쉬는 날");
		}
		else {
			System.out.println("자바 공부");
		}
		
	}

}
