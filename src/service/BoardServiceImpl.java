package service;

import java.util.List;

import dao.BoardDAO;
import dao.UserDAO;
import vo.BoardVO;

public class BoardServiceImpl implements BoardService{

private BoardDAO dao = null;
	
	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public BoardServiceImpl(BoardDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void write(BoardVO vo) {
		dao.write(vo);
		
	}
	@Override
		public List<BoardVO> boardList() {
			return dao.boardList();
		}
	
	@Override
		public BoardVO boardRead(int bno) {
			// TODO Auto-generated method stub
			return dao.boardRead(bno);
		}
}
