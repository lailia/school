package chap02.exam1;

public class VariableExam3 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + " y : " + y);
		int z = 0;
		
		z=x;
		x=y;
		y=z;
		System.out.println("x : " + x + " y : " + y);

	}

}
