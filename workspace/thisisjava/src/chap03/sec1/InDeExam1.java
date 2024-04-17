package chap03.sec1;

public class InDeExam1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		++x;	//먼저 1씩 증가
		x++;	//나중에 1씩 증가
		
		System.out.println("x : " + x);
		System.out.println("--------------------------");
		
		--y;	//먼저 1씩 감소
		y--;	//나중에 1씩 감소
		
		System.out.println("y : " + y);
		System.out.println("--------------------------");
		
		z = x++;	//z에 x값을 먼저 넣고 나중에 x값이 1 증가
		
		System.out.println("z : " + z);
		System.out.println("x : " + x);
		System.out.println("--------------------------");
		
		z = ++x;	//x값을 먼저 1 증가 시키고 z에 넣음
		
		System.out.println("z : " + z);
		System.out.println("x : " + x);
		System.out.println("--------------------------");
		
		z = ++x + y++;	//x값은 먼저 1증가시켜서 연산, y값은 연산 한 후 1증가
		
		System.out.println("z : " + z);
		System.out.println("x : " + x);
		System.out.println("y : " + y);

	}

}
