package chap12.sec11;

public class GetClassExam1 {

	public static void main(String[] args) throws Exception{
		//방법 1(클래스 이름만 가지고 Class 객체를 얻는 방법
		Class class1 = Car.class;
		
		//방법 2(클래스 이름만 가지고 Class 객체를 얻는 방법
		Class class2 = Class.forName("chap12.sec11.Car");
		Class class3 = Class.forName("java.lang.String");
		
		//방법 3(객체로부터 얻는 방법)
		Car car = new Car();
		Class class4 = car.getClass();
		
		String str = "감자바";
		Class class5 = str.getClass();
		
		System.out.println("패키지 : " + class1.getPackage().getName());
		//getPackage() : 패키지 정보를 읽기
		//getName() : 피키지를 포함한 전체 타입의 이름
		System.out.println("클래스의 간단 이름 : " + class1.getSimpleName());
		//getSimpleName() : 패키지를 제외한 타입 이름
		System.out.println("클래스의 전체 이름 : " + class1.getName());
		System.out.println();
		
		System.out.println("패키지 : " + class2.getPackage().getName());
		System.out.println("클래스의 간단 이름 : " + class2.getSimpleName());
		System.out.println("클래스의 전체 이름 : " + class2.getName());
		System.out.println();
		
		System.out.println("패키지 : " + class3.getPackage().getName());
		System.out.println("클래스의 간단 이름 : " + class3.getSimpleName());
		System.out.println("클래스의 전체 이름 : " + class3.getName());
		System.out.println();
		
		System.out.println("패키지 : " + class4.getPackage().getName());
		System.out.println("클래스의 간단 이름 : " + class4.getSimpleName());
		System.out.println("클래스의 전체 이름 : " + class4.getName());
		
		System.out.println("패키지 : " + class5.getPackage().getName());
		System.out.println("클래스의 간단 이름 : " + class5.getSimpleName());
		System.out.println("클래스의 전체 이름 : " + class5.getName());
		System.out.println();

	}

}
