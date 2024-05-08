package chap15.sec09.exam7;

import java.util.List;

public class ListExam1 {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}

	}

}
