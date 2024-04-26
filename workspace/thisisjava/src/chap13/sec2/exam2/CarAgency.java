package chap13.sec2.exam2;

//CarAgency는 Car을 렌트해 주는 대리점 클래스
public class CarAgency implements Rentable<Car>{
	//타입 파라미터 P대신 Car으로 대체함
	@Override
	public Car rent() {	//리턴 타이이 반드시 Car이어야함 
		return new Car();
		
	}
	
}
