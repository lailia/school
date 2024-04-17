package chap04.sec8;

import java.util.Scanner;

public class ScannerExam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------");
			System.out.print("선택 : ");
			
			int str = scan.nextInt();
			
			switch(str) {
			case 1 ->
			{
				System.out.print("예금액 : ");
				num += scan.nextInt();
			}
			case 2 ->
			{
				System.out.print("출금액 : ");
				num -= scan.nextInt();
			}
			case 3 ->
			{
				System.out.println("잔고 : " + num);
			}
			default->
			{
				run = false;
			}
			}
		}
		
		System.out.println("종료");
		
		scan.close();
		
	}

}