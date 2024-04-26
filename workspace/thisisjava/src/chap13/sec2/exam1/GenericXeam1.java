package chap13.sec2.exam1;

public class GenericXeam1 {

	public static void main(String[] args) {
		//K대신 TV로 대체, M은 String 으로 대체함
		Product<TV, String> product1 = new Product<>();
		
		//Setter의 매개값은 반드시TV와 String을 제공함
		product1.setKind(new TV());
		product1.setModel("스마트 TV");
		
		//Getter의 리턴값은 TV와 String이 됨
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println(tv);
		System.out.println(tvModel);
		
		//K대신 Car로 대체, M은 String 으로 대체함
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		

		System.out.println(car);
		System.out.println(carModel);
		
		//Product<K,M> 제네릭 타입을 이용해서
		//TV와 Car 객체를 저장하고 얻는 방법을 보여줌
	}

}
