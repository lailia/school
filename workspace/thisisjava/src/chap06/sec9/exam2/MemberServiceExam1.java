package chap06.sec9.exam2;

public class MemberServiceExam1 {

	public static void main(String[] args) {
		MemberService mv = new MemberService();
		
		if(mv.login("hong", "12345")) {
			System.out.println("로그인 되었습니다");
		}
		
		mv.logout("hong");

	}

}