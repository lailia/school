package chap12.sec5;

import java.util.Arrays;

public class BytesToStringExam1{

	public static void main(String[] args) throws Exception{
		//문자열을 byte 배열로 변환시키고 다시 문자열로 복원
		String data = "자바";
		
		byte[] arr1 = data.getBytes();
		//String -> byte 배열로 변환(UTF-8 인코딩)

		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		//byte 배열 -> String(UTF-8 디코딩)
		String str1 = new String(arr1);
		System.out.println("str1 : " + str1);
		//String -> byte 배열로 변환(EUC_KR 인코딩)
		byte[] arr2 = data.getBytes("EUC-KR");
		
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		String str2 = new String(arr2, "EUC-KR");
		System.out.println("str2 : " + str2);
		//한글 1자를 UTF-8로 인코딩하면 3바이트가 되고,
		//EUC-KR로 인코딩하면 2바이트가 됨
		//인코딩할때 사용한 문자셋으로 디코딩을 해야만 한글이 올바르게 복원될 수 있음

	}

}
