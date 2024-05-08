package chap15.sec06.exam1;

import java.util.Stack;

public class StackExam1 {

	public static void main(String[] args) {
		// Stack 컬렉션 생성(LIFO 구조)
		Stack<Coin> coinBox = new Stack<>();
		
		//동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전을 하나씩 꺼내기
		while(!coinBox.isEmpty()) {//비어있지 않다면 반복함
			Coin coin = coinBox.pop();	//pop()은 스택에서 객체하나 꺼내오기
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}

	}

}
