package chap15.sec04.exam3;

import java.util.Properties;

public class PropertiesExam1 {
	
	public static void main(String[] args) throws Exception{
		//Properties 컬렉션 생성
		//확장자가 *.properties인 프로퍼티 파일을 읽을 때 사용함
		//프로퍼티 파일은 키와 값이 = 기호로 연결된 텍스트 파일
		Properties pro = new Properties();
		
		//PropertiesExam1.class와 동일한 ClassPath에 있는 database.properties 파일 로드
		pro.load(PropertiesExam1.class.getResourceAsStream("database.properties"));
		//load() 메소드로 프로퍼티 파일의 내용을 메모리로 로드함
		
		//주어진 키에 대한 값 읽기
		String driver = pro.getProperty("driver");
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		String admin = pro.getProperty("admin");
		
		//값 출력
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("admin : " + admin);
		
	}
}
