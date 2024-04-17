package chap02.sec1;

public class LongExam1 {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20l;
		long var3 = 12345678910l;
		//long var3 = 12345678910;	컴파일러가 int로 간주하기 때문에 에러 발생
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);

	}

}
