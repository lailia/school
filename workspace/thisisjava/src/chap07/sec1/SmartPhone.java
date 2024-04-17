package chap07.sec1;

public class SmartPhone extends Phone{	//상속 방법 : extends 부모 클래스명
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("wifi : " + this.wifi);
	}
	
	public void internet() {
		System.out.println("인터넷에 연결");
	}

}
