package chap07.sec9.exam1;

public class PhoneExam1 {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone sm = new SmartPhone("갤럭시");
		
		System.out.println(sm.owner);
		
		sm.turnOn();
		sm.internetSearch();
		sm.turnOff();

	}

}
