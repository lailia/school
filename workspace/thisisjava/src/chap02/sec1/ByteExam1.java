package chap02.sec1;

public class ByteExam1 {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = 0;
		byte var3 = 127;
		//byte var4 = 128;	컴파일 에러 발생(byte 타입 변수의 허용 범위 초과)
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);

	}

}
