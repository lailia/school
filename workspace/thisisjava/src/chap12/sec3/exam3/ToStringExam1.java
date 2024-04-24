package chap12.sec3.exam3;

public class ToStringExam1 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("삼성","안드로이드");
		
		String str = phone.toString();	//호출
		
		System.out.println(str);
		
		System.out.println(phone);
		//매개값이 객체가 되면 객체의 toString()메소드 호출
		//해서 리턴값을 출력함

	}

}
