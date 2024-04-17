package chap03.sec8;

public class BitLogicExam1 {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("45 = " + ~45);
		
		System.out.println("-------------------------");
		
		byte receiveData = -128;
		
		int unsignedInt1 = receiveData & 255;	//비트 논리곱 연산으로 unsigned 정수 얻기
		
		System.out.println("unsignedInt1 : " + unsignedInt1);
		
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);	//자바API를 이용해서 unsigned 정수 얻기
		
		System.out.println("unsignedInt2 : " + unsignedInt2);

	}

}
