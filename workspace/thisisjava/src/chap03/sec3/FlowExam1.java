package chap03.sec3;

public class FlowExam1 {

	public static void main(String[] args) {
		byte var1 = 125;
		
		for(int i = 0; i < 5; i++) {	//중괄호 안의 내용을 5번 반복실행
			var1++;	//var1값을 1 증가시킴
			System.out.println("var1 : " + var1);
			
		}
		System.out.println("-------------------------------");
		
		byte var2 = -125;
		
		for(int i=0;i<5;i++) {
			var2--;
			System.out.println("var2 : " + var2);
		}

	}

}
