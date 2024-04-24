package chap12.sec4;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExam1 {

	public static void main(String[] args) {
		//운영체제와 사용자 정보 출력
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		//전체 키와 값을 출력
		System.out.println("------------------------");
		System.out.println(" Key: value");
		System.out.println("------------------------");
		
		Properties pro =  System.getProperties();
		Set Keys = pro.keySet();
		for(Object obj : Keys) {
			String Key = (String) obj;
			String value = System.getProperty(Key);
			System.out.printf("%-40s: %s \n", Key, value);
		}

	}

}
