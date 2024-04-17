package chap02.sec12;

public class PrintfExam1 {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n" , value);
		System.out.printf("상품의 가격 : %6d원\n" , value);	//오른쪽 정렬
		System.out.printf("상품의 가격 : %-6d원\n" , value);	//왼쪽 정렬
		System.out.printf("상품의 가격 : %06d원\n" , value);	//빈칸을 0으로채우는 오른쪽 정렬
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름 %d 인 원의 넓이 : %10.2f\n",10,area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n",value,name,job);

	}

}
