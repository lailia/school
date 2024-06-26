package chap05.sec12;

import java.util.Scanner;

public class ProgramExam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int value = 0;
		int[] scores = {0};
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------");
			
			String a = scan.nextLine();
			
			switch(a) {
			case "1" : 
				System.out.print("선택 : ");
				value = scan.nextInt();
				scores = new int[value];
				break;
			case "2" :
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] : ");
					scores[i] = scan.nextInt();
				}
				break;
			case "3" :
				for(int i = 0; i < scores.length; i ++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
				break;
			case "4" : 
				int max = 0;
				int sum = 0;
		
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if(max <= scores[i]) {
						max = scores[i];
					}
				}
				
				double avg = (double)sum/value;
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				break;
			case "5" :
				run = false;
				break;
			default:
				System.out.println("제대로 입력해 주세요");
			}
		}
		System.out.println("프로그램 종료");
		
		scan.close();

	}

}
