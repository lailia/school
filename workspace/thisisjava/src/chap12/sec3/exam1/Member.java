package chap12.sec3.exam1;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	//object 클래스의 equals() 메소드를 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			//obj가 Member 타입인지 검사하고 타입변환 후 target변수에 값을 리턴
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}

}
