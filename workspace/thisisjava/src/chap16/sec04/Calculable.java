package chap16.sec04;

@FunctionalInterface
public interface Calculable {
	double calc(double x, double y);
	//Calculable 인터페이스에 리턴값이 있는 calc() 추상 메소드 작성
}
