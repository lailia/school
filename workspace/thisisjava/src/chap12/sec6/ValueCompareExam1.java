package chap12.sec6;

public class ValueCompareExam1 {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==: " + (obj1 == obj2));
		System.out.println("equals(): " + obj1.equals(obj2));
		System.out.println();
		//-127 ~ 127 범위값일 경우
		//포장 객체의 효율적 사용을 위해 byte, short, int 타입이
		//-127 ~ 127 범위값일 경우의 포장 객체는 ==와 equals 메소드를 같은 의미로 사용
		
		Integer obj3 = 30;
		Integer obj4 = 30;
		System.out.println("==: " + (obj3 == obj4));
		System.out.println("equals(): " + obj3.equals(obj4));

	}

}
