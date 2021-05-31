package service;

import java.util.List;

import vo.BoardVO;

public interface BoardService {
	
	public void write(BoardVO vo);
	public List<BoardVO> boardList();

	public BoardVO boardRead(int bno);

}
