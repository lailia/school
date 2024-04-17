package chap06.sec9.exam2;

public class MemberService {
	String id = "hong";
	String pw = "12345";
	
	boolean login(String id, String pw){
		if(this.id.equals(id) && this.pw.equals(pw)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(this.id + "님이 로그아웃");
	}
}
