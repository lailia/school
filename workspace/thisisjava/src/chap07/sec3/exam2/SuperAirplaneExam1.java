package chap07.sec3.exam2;

public class SuperAirplaneExam1 {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = SuperSonicAirplane.SuperSonic;
		sa.fly();
		sa.flymode = SuperSonicAirplane.Normal;
		sa.fly();
		sa.land();
		
	}

}
