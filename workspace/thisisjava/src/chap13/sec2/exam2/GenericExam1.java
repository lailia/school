package chap13.sec2.exam2;

public class GenericExam1 {

	public static void main(String[] args) {
		HomeAgency ha = new HomeAgency();
		Home home = ha.rent();
		home.turnOnLight();
		
		CarAgency ca = new CarAgency();
		Car car = ca.rent();
		car.run();

	}

}