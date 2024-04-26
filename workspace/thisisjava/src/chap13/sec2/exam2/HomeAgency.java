package chap13.sec2.exam2;

//HomeAgency는 Home을 렌트해 주는 대리점 클래스
public class HomeAgency implements Rentable<Home>{
	//타입 파라미터 P대신 Home으로 대체함
	@Override
	public Home rent() {	//리턴 타이이 반드시 Home이어야함 
		return new Home();
		
	}
	
}
