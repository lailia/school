package chap05.sec2;

public class ArrExam1 {

	public static void main(String[] args) {
		String[] name = new String[4];
		name[0] = "Jason";
		name[1] = "Tom";
		name[2] = "Hillary";
		name[3] = "Jakal";
		
		System.out.println("name.length : " + name.length);
		for(int i = 0; i < name.length;i++) {
			System.out.println("name [" + i + "] : " + name[i]);
		}
		
		int[] j = {70, 80, 90};
		System.out.println("j[2] : " + j[2]);

	}

}
