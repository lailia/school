package chap05.sec8;

public class ArrayExam1 {

	public static void main(String[] args) {
		int[] array = {5, 1, 3, 8, 2};
		int max = 0;
		int min = 100;
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);

	}

}
