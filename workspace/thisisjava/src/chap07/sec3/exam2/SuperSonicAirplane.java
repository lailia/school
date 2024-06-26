package chap07.sec3.exam2;

public class SuperSonicAirplane extends Airplane{
	
	public static final int Normal = 1;
	public static final int SuperSonic = 2;
	
	public int flymode = Normal;
	
	//메소드 재정의
	@Override
	public void fly() {
		if(flymode == SuperSonic) {
			System.out.println("초음속 비행기");
		}
		else {
			//Airplane객체의 fly()메소드 호출
			super.fly();
		}
	}

}
