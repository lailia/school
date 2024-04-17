package chap06.sec7.exam2;

public class Television {
	
	static String company = "LG";
	static String model = "LCD";
	static String info;
	
	//정적 블록 : 복잡한 초기화 과정이 필요하다면 정적 블록을 이용
	static {
		info = company + "-" +model;
	}
	
}
