package chap12.sec8;

import java.util.TimeZone;

public class PrintTimeZonID {

	public static void main(String[] args) {
		//TimeZon.getAvailableIDs()
		//모든 시간대 ID를 출력함
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}

	}

}
