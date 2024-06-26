package chap12.sec3.exam5;

public class InExam1 {

	public static void main(String[] args) throws Exception{
		int speed = 0;
		int KeyCode = 0;
		
		while(true) {
			//Enter 키를 입력하지 않았을 경우에만 실행함
			if(KeyCode != 13 && KeyCode != 10) {
				//유니코드 13과 10은 엔터임
				if(KeyCode == 49) {	//유니코드 49는 숫자 1을 의미함
					speed++;
				}
				else if(KeyCode == 50) {	//유니코드 50는 숫자 2을 의미함
					speed--;
				}
				else if(KeyCode == 51) {	//유니코드 51는 숫자 3을 의미함
					break;
				}
				System.out.println("-------------------------------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-------------------------------------------------");
				System.out.println("현재 속도 = " + speed);
				System.out.print("선택 : ");
				
			}
			
			//키를 하나씩 입력받아 읽음
			KeyCode = System.in.read();
			//in 필드를 이용해서 read()메소드를 호출하면
			//==> 입력된 키의 코드값을 얻음
			//read()메소드는 enter키를 누르기 전까지는 대기상태임
			//enter키를 누르면 입력했던 키들은 하나씩 읽기 시작함
		}
		
		System.out.println("프로그램 종료");

	}

}
