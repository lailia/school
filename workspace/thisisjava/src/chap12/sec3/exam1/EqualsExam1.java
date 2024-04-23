package chap12.sec3.exam1;

public class EqualsExam1 {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("green");
		
		if(obj1.equals(obj2)) {	//매개값이 Member타입이고, id도 동일하므로 true가 나옴
			System.out.println("obj1과 obj2는 같다");
		}
		else {
			System.out.println("obj1과 obj2는 다르다");
		}
		
		if(obj2.equals(obj3)) {	//매개값이 Member타입이고, id가 다르므로 false가 나옴
			System.out.println("obj2과 obj3는 같다");
		}
		else {
			System.out.println("obj2과 obj3는 다르다");
		}

	}

}
