package chap12.sec7;

import java.util.Arrays;
import java.util.Random;

public class RandomExam1 {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];	//선택번호 6개가 저장될 공간
		Random random = new Random();	//Random객체 생성
		System.out.print("선택 번호 : ");
		
		for(int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			//nextInt(int n) : int타입의 난수를 리턴(0<= ~<n);
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨 번호
		int[] win = new int[6];	//당첨번호 6개가 저장될 공간
		random = new Random();
		
		System.out.print("당첨 번호 : ");
		for(int i = 0; i < 6; i++) {
			win[i] = random.nextInt(45) + 1;
			System.out.print(win[i] + " ");
		}
		System.out.println();
		
		//당첨 여부
		Arrays.sort(selectNumber);	//배열 항목 정렬
		Arrays.sort(win);
		boolean result = Arrays.equals(selectNumber, win);
		
		System.out.println("당첨 여부 : ");
		if(result) {
			System.out.println("1등 당첨");
		}
		else {
			System.out.println("당첨되지 않음");
		}
		
		//random 메소드 : 0.0 ~ 1.0 사이의 double 타입 난수를 리턴함
		//int num = (int)(Math.random()*n) + start;
		//start부터 시작하는 n개의 정수를 얻는 공식
		
		//java.util.Random 클래스를 이용 =>boolean, int, double 난수를 얻음
		//Random() : 현재 시간을 이용해서 종자값을 자동으로 설정
		//Random(long seed) : 주어진 종자값을 사용함

	}

}
