package chap05.sec7;

public class ArrayExam3 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];

		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println();
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println();
		
		double[] arr2 = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();
		
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();
		
		String[] arr3 = new String[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		System.out.println();
		
		arr3[0] = "aa";
		arr3[1] = "bb";
		arr3[2] = "cc";
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		System.out.println();
		
	}

}