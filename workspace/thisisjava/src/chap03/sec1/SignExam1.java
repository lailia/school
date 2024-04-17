package chap03.sec1;

public class SignExam1 {

	public static void main(String[] args) {
		int x = -100;
		x=-x;
		System.out.println("x : " + x);
		
		byte b = 100;
		int y = -b;		//부호 변경도 연산에 해당하므로 int타입에 대입함
		
		System.out.println("y : " + y);
		
	}

}
