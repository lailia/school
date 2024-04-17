package chap02.sec10;

public class StringConversioExam1 {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");			//String을 int로 변환
		double value2 = Double.parseDouble("3.14");		//String을 double로 변환
		boolean value3 = Boolean.parseBoolean("true");	//String을 boolean으로 변환
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String str1 = String.valueOf(100);	//정수를 문자열로 변환
		String str2 = String.valueOf(3.14);	//실수를 문자열로 변환
		String str3 = String.valueOf(false);//불린을 문자열로 변환
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
