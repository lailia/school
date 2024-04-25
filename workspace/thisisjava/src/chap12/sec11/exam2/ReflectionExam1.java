package chap12.sec11.exam2;

import java.lang.reflect.*;
//리플렉션
//Class 객체로 관리하는 클래스와 인터페이스의 메타 정보를 프로그램에서
//읽고 수정하는 것
//메타 정보 : 패키지정보, 타입정보, 멤버(생성자, 필드, 메소드) 정보를 말함
//생성자, 필드, 메소드, 클래스는 모두 java.lang.reflect패키지에 있음

public class ReflectionExam1 {

	public static void main(String[] args) throws Exception{
		//Class class1 = Car.class;	//방법1 : Class 객체 정보를 얻음
		Class class1 = Class.forName("chap12.sec11.exam2.Car");	//방법2 : Class 객체 정보를 얻음
		System.out.println("[생성자 정보]");
		Constructor[] cons1 = class1.getDeclaredConstructors();
		//getDeclaredConstructors() : 생성자 정보 읽기
		for(Constructor cons2 : cons1) {
			System.out.print(cons2.getName() + "(");
			//getName() : 패키지를 포함한 전체 타입 이름
			Class[] p = cons2.getParameterTypes();
			printParameters(p);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = class1.getDeclaredFields();
		//getDeclaredFields() : 필드 정보 읽기
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		
		System.out.println("[메소드 정보]");
		Method[] methods = class1.getDeclaredMethods();
		//getDeclaredMethods() : 메소드 정보 읽기
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] p = method.getParameterTypes();
			//getParameterTypes() : 메소드 아규먼트 타입의 전체 패키지명을 읽어줌
			printParameters(p);
			System.out.println(")");
		}
		
	}
	
	private static void printParameters(Class[] p) {
		for(int i = 0; i < p.length; i++) {
			System.out.print(p[i].getName());
			//if(i < )
		}
	}

}
