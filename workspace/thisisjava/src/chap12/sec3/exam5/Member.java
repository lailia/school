package chap12.sec3.exam5;

import lombok.Data;
import lombok.NonNull;

//@Data
//컴파일 과정에서 기본 생성자와 함께 Getter, Setter, hashCode(),
//equals(), toString() 메소드가 자동 생성됨
@Data
public class Member {
	//final과 @NonNull필드만 초기화시키는 생성자를 포함시킴
	private final String id;
	@NonNull private String name;
	//@onNull
	//null이 아닌 다른 값으로 Setter 메소드를 통해 변경할 수 있음
	
	private int age;

}
