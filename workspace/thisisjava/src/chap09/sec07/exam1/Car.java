package chap09.sec07.exam1;

public class Car {
	//필드에 Tire객체 대입
	private Tire tire1 = new Tire();
	//필드에 익명 자식 객체를 대입
	private Tire tire2 = new Tire() {	//부모 메소드를 재정의

		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체1이 구러갑니다");
		}
	};
	
	//필드를 이용한 메소드
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	//메소드(로컬 변수 이용)
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다");
			}
		};
		tire.roll();
	}
	
	//메소드 (매개 변수 이용
	public void run3(Tire tire) {
		tire.roll();
	}

}
