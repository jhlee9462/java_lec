package chapter15;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> boards = new ArrayList<>();
		for (int i = 1 ; i < 4; i++)
			boards.add(new Board("제목" + i, "내용" + i));
		return boards;
	}
	
}
