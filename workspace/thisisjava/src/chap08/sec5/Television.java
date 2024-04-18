package chap08.sec5;

public class Television implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV 킴");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV 끔");
	}
	
	@Override
	public void setVolume(int vol) {
		if(vol > Max_Volume) {
			this.volume = Max_Volume;
		}
		else if(vol < Min_Volume) {
			this.volume = Min_Volume;
		}
		else {
			this.volume = vol;
		}
		
		System.out.println("음량 : " + this.volume);
	}
	
	

}
