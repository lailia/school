package chap06.sec4.exam5;

public class CarExam1 {

	public static void main(String[] args) {
		Car1 c1 = new Car1("자가용");	//생성자1 호출
		System.out.println("c1.company : " + c1.company);
		System.out.println("c1.company : " + c1.model);
		System.out.println("c1.company : " + c1.color);
		System.out.println("c1.company : " + c1.maxSpeed);
		System.out.println();
		
		Car1 c2 = new Car1("화물차", "빨강");	//생성자2 호출
		System.out.println("c1.company : " + c2.company);
		System.out.println("c1.company : " + c2.model);
		System.out.println("c1.company : " + c2.color);
		System.out.println("c1.company : " + c2.maxSpeed);
		System.out.println();
		
		Car1 c3 = new Car1("택시", "검정", 300);	//생성자3 호출
		System.out.println("c1.company : " + c3.company);
		System.out.println("c1.company : " + c3.model);
		System.out.println("c1.company : " + c3.color);
		System.out.println("c1.company : " + c3.maxSpeed);
		System.out.println();

	}

}
