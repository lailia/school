package chap05.sec4;

public class GarbageExam1 {

	public static void main(String[] args) {
		String hob = "여행";
		
		System.out.println(hob);
		
		hob=null;
		
		System.out.println(hob);
		
		String kind1 = "자동차";
		String kind2 = kind1;
		
		System.out.println(kind1);
		System.out.println(kind2);

	}

}
