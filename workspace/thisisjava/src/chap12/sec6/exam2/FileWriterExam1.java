package chap12.sec6.exam2;

import java.io.IOException;

public class FileWriterExam1 {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("file.txt")) {
			fw.write("JAVA");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
