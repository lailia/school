package chap06.sec9.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import chap06.sec9.hankook.SnowTire;

public class Car {
	//부품 필드 선언
	chap06.sec9.hankook.SnowTire tire1 = new chap06.sec9.hankook.SnowTire();
	chap06.sec9.kumho.Tire tire2 = new chap06.sec9.kumho.Tire();
	SnowTire tire3 = new SnowTire();
}
