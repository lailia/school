package chap07.sec3.exam1;

public class ComputerExam1 {

	public static void main(String[] args) {
		Computer com = new Computer();
		Calculator cal = new Calculator();
		
		int r = 10;
		
		System.out.println("cal의 원 면적 : " + cal.areaCircle(r));
		System.out.println("com의 원 면적 : " + com.areaCircle(r));

	}

}
