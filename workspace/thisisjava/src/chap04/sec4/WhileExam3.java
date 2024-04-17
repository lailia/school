package chap04.sec4;

import java.util.Scanner;

public class WhileExam3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int speed = 0;
		
		while(true) {
			System.out.println("-------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------");
			System.out.println("선택 : ");
			String str = scan.nextLine();
			
			if(str.equals("1")) {
				speed++;
			}
			else if(str.equals("2")) {
				speed--;
			}
			else if(str.equals("3")) {
				break;
			}
			else {
				System.out.println("정확하게 입력해주세요");
			}
			
			System.out.println("speed : " + speed);
		}
		
		System.out.println("while 다음 문장");
		
		scan.close();

	}

}
