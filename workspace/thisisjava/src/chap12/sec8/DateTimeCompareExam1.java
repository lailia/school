package chap12.sec8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExam1 {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2023, 11, 28, 12, 30, 0);
		System.out.println("시작일 : " + startDateTime.format(dtf));
		LocalDateTime endDateTime = LocalDateTime.of(2024, 12, 31, 12, 30, 0);
		System.out.println("종료일 : " + endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) {	//이전 날짜인지
			System.out.println("진행 중");
		}
		else if(startDateTime.isEqual(endDateTime)) {	//동일한 날짜인지
			System.out.println("D-Day");
		}
		else if(startDateTime.isAfter(endDateTime)){	//이후 날짜인지
			System.out.println("종료");
		}
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		System.out.println("남은 해 : " + remainYear);
		
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		System.out.println("남은 월 : " + remainMonth);
		
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시간 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
	}

}
