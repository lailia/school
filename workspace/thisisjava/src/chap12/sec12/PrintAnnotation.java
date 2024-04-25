package chap12.sec12;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
//ElementType.METHOD : 어노테이션 적용 대상을 METHOD로 지정함
@Retention(RetentionPolicy.RUNTIME)
//RetentionPolicy.RUNTIME : 어노테이션 적용정책을 RUNTIME으로 지정
//=>RUNTIME은 실행할때 적용, 계속 유지됨

public @interface PrintAnnotation {
	String value() default "-";	//value 속성 : 선의 종류(-)
	int number() default 15;	//number 속성 : 출려 횟수

}
