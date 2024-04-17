package chap06.sec5.exam2;

public class ComputerExam1 {

	public static void main(String[] args) {
		//Computer객체 생성
		Computer com1 = new Computer();
		
		//sum 메소드 호출시 1, 2, 3을 제공하고 합산결과를 리턴
		int result = com1.sum(1, 2, 3);
		System.out.println("result1 : " + result);
		
		int result1 = com1.sum(1, 2, 3, 4, 5);
		System.out.println("result2 : " + result1);
		
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int result3 = com1.sum(values);
		System.out.println("result3 : " + result3);
		
		int result4 = com1.sum(new int[] {1, 2, 3, 4, 5});
		System.out.println("result4 : " + result4);

	}

}
