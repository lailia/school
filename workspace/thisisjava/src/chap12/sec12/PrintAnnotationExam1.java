package chap12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExam1 {
	//Service 클래스에 선언된 메소드를 리플렉션해서
	//@PrintAnnotation 설정 정보를 얻어낸 후
	//구분선을 출력하고 해당 메서드를 호출함

	public static void main(String[] args) throws Exception{
		Method[] declaredMethods = Service.class.getDeclaredMethods();	//메소드 정보 읽기
		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation print = method.getAnnotation(PrintAnnotation.class);
			//지정한 어노테이션이 적용되어있으면 어노테이션을 리턴함. 그렇지 않으면 null
			
			//설정 정보를 이용해서 선 출력
			printLine(print);
			
			//메소드 호출
			method.invoke(new Service());
			//invoke : 메소드 동적으로 실행시켜줌
			
			//설정 정보를 이용해서 선 출력
			printLine(print);
			
		}

	}
	
	public static void printLine(PrintAnnotation p) {
		if(p != null) {
			//number 속성값 얻기
			int number = p.number();
			for(int i=0; i<number; i++) {
				//value 속성값 얻기
				String value = p.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}

}
