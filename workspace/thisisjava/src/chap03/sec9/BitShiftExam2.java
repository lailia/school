package chap03.sec9;

public class BitShiftExam2 {

	public static void main(String[] args) {
		int value = 772;	//[00000000][00000000][00000011][00000100]
		
		//우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음
		byte byte1 = (byte)(value >>> 24);
		int int1 = byte1 & 255;
		
		System.out.println("int1 : " + int1);
		
		//우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음
		byte byte2 = (byte)(value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		
		System.out.println("int2 : " + int2);
		
		//우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음
		byte byte3 = (byte)(value >>> 8);
		int int3 = byte3 & 255;
		
		System.out.println("int3 : " + int3);
		
		//끝 1byte만 읽음
		byte byte4 = (byte)value;
		int int4 = Byte.toUnsignedInt(byte4);
		
		System.out.println("int4 : " + int4);

	}

}
