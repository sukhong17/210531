package servlet.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import service.BoardService;
import service.BoardServiceImpl;
import vo.BoardVO;

@WebServlet("/board/list.do")
public class BoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardList() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    
	    
	    BoardDAO dao = new BoardDAO();
	    BoardService service = new BoardServiceImpl(dao);
	    List<BoardVO> list = service.boardList();
	    
	    request.setAttribute("list", list);
	    
	    getServletContext().
	    getRequestDispatcher("/board/list.jsp").
	    forward(request, response);
	    
	}

	

}
