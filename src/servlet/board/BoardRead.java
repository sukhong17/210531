package servlet.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import dao.UserDAO;
import service.BoardService;
import service.BoardServiceImpl;
import service.UserService;
import service.UserServiceImpl;
import vo.BoardVO;

@WebServlet("/board/read.do")
public class BoardRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardRead() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    
	    int bno = Integer.parseInt(request.getParameter("bno"));
	    
	    
	    BoardDAO dao = new BoardDAO();
	    BoardService service = new BoardServiceImpl(dao);
	    
	    BoardVO vo = service.boardRead(bno);
	    request.setAttribute("read", vo);
	    
	    getServletContext().
	    getRequestDispatcher("/board/read.jsp").
	    forward(request, response);
	
	}


}
