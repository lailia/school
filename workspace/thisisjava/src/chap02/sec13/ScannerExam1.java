package chap02.sec13;

import java.util.Scanner;

public class ScannerExam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		String strX = scan.nextLine();		//Enter 키를 누르면 입력한 모든 문자열을 저장
		//System.out.println("x : " + strX);
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력 : ");
		String strY = scan.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		
		System.out.println("x + y = " + result);
		
		while(true) {
			System.out.print("입력 : ");
			String data = scan.nextLine();
			if(data.equals("q")) {
				break;
			}
			
			System.out.println("출력 : " + data);
			
		}
		
		System.out.println("종료");
		
		scan.close();

	}

}
