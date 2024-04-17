package chap03.sec11;

public class CondExam1 {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : 'B';
		
		System.out.println("점수 : " + score + "점은 " + grade +"등급입니다");
		
		int score1 = 75;
		char grade1 = (score1>90)?'A':((score1>80)?'B':'C');
		
		System.out.println("점수 : " + score1 + "점은 " + grade1 + "등급입니다");
		
		int score3 = 85;
		String result = (!(score3>90))?"가":"나";
		
		System.out.println("result : " + result);
		
		int score4 = 95;
		String result2 = (score4>90)?"참 잘":"화이팅";
		
		System.out.println("result2 : " + result2);

	}

}
