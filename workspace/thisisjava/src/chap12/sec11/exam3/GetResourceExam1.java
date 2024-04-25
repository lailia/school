package chap12.sec11.exam3;

public class GetResourceExam1 {

	public static void main(String[] args) {
		Class class1 = Car.class;	//방법1 : Class 객체 정보를 얻음
		
		String photo1Path = class1.getResource("cat.jpg").getPath();
		//getResource()는 경로 정보가 담긴 URL 객체를 리턴함
		System.out.println(photo1Path);

		String photo2Path = class1.getResource("image/cat.jpg").getPath();
		
		System.out.println(photo2Path);

	}

}
