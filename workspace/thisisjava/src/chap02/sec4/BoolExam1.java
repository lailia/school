package chap02.sec4;

public class BoolExam1 {

	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}
		
		int x = 10;
		boolean result1 = (x==20);			//==은 같다
		boolean result2 = (x!=20);			//!=은 같지않다
		boolean result3 = (0<x && x<20);	//&&은 AND 조건
		boolean result4 = (x<0 || x>20);	//||은 OR 조건
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);

	}

}
