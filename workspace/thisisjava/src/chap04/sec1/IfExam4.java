package chap04.sec1;

public class IfExam4 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;	//Math.random()은 0.0~1.0보다 작은 double타입 난수 리턴
		
		System.out.println("num : " + num);
		
		if(num == 1) {
			System.out.println("1번");
		}
		else if(num == 2) {
			System.out.println("2번");
		}
		else if(num == 3) {
			System.out.println("3번");
		}
		else if(num == 4) {
			System.out.println("4번");
		}
		else if(num == 5) {
			System.out.println("5번");
		}
		else {
			System.out.println("6번");
		}
		
		System.out.println("if 다음문장 실행");
		
	}

}
