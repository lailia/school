package chap07.sec9.exam2;

public class AbstractExam1 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.sound();
		
		Cat cat = new Cat();
		
		cat.sound();
		
		animalSound(dog);
		animalSound(cat);

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
