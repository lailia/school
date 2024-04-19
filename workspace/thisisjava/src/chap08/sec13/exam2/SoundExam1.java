package chap08.sec13.exam2;

public class SoundExam1 {
	
	public static void printSound(Sound sound) {
		System.out.println(sound.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
