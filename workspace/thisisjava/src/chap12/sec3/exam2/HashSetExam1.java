package chap12.sec3.exam2;

import java.util.HashSet;

public class HashSetExam1 {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1,"홍길동");
		hashSet.add(s1);	//HashSet에 Student객체를 저장함
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s2 = new Student(1,"홍길동");
		hashSet.add(s2);
		//동등 객체는 중복 저장하지 않음
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s3 = new Student(2,"홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 수 : " + hashSet.size());

	}

}