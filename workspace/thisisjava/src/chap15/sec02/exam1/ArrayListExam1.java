package chap15.sec02.exam1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam1 {

	public static void main(String[] args) {
		//ArrayList 컬렉션 생성
		//ArrayList는 List 컬렉션에서 가장 많이 사용하는 컬렉션
		//ArrayList는 객체를 추가하면 내부 배열에 객체가 저장되고 제한 없이 객체를 추가할 수 있음
		List<Board> list = new ArrayList<>();
		//객체 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(1);
		
		System.out.println(board.getSubject() + ", " + board.getContent() + ", " + board.getWriter());
		System.out.println();
		
		//모든 객체 하나씩 가져오기
		for(int i = 0; i < size; i++) {
			
			Board board1 = list.get(i);
			
			System.out.println(board1.getSubject() + ", " + board1.getContent() + ", " + board1.getWriter());
		}
		System.out.println();
		
		//객체 삭제 : remove()
		list.remove(5);
		list.remove(2);
		list.remove(2);
		list.remove(2);
		
		for(Board board1 : list) {
			System.out.println(board1.getSubject() + ", " + board1.getContent() + ", " + board1.getWriter());
		}

	}

}
