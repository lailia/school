package chap06.sec8.exam2;

public class Earth {
	
	//상수 선언 및 초기화
	static final double Earth_Radius = 100;
	
	//상수 서언
	static final double Earth_Surface_Area;
	
	//정적 블록에서 상수 초기화
	static {
		Earth_Surface_Area = 4 * Earth_Radius * Earth_Radius;
	}

}
