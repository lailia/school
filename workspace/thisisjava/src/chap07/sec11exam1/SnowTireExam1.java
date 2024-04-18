package chap07.sec11exam1;

public class SnowTireExam1 {

	public static void main(String[] args) {
		SnowTire st = new SnowTire();
		
		Tire t = st;
		
		st.run();
		t.run();

	}

}
