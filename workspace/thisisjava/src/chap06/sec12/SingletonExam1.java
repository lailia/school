package chap06.sec12;

public class SingletonExam1 {

	public static void main(String[] args) {
		//Singleton ob1 = new Singleton();	//에러
		
		//정적 메소드를 호출해서 객체를 생성
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		
		if(ob1 == ob2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}

	}

}
