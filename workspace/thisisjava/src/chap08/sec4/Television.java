package chap08.sec4;

public class Television implements RemoteControl{
	
	private int volume;
	
	//turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV 킴");
	}
	
	//turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV 끔");
	}
	
	//setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int vol) {
		if(vol > RemoteControl.Max_Volume) {
			this.volume = RemoteControl.Max_Volume;
		}
		else if(vol < RemoteControl.min_Volume) {
			this.volume = RemoteControl.min_Volume;
		}
		else {
			this.volume = vol;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}

}
