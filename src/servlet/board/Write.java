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

@WebServlet("/board/write.do")
public class Write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Write() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    
	    String id = request.getParameter("id");
	    String title = request.getParameter("title");
	    String content = request.getParameter("content");
	    
	    System.out.println(title + "title" + content + " / content" + id + "/  id");
	    
	    BoardDAO dao = new BoardDAO();
	    BoardService service = new BoardServiceImpl(dao);
	    
	    BoardVO vo= new BoardVO();
	    vo.setId(id);
	    vo.setTitle(title);
	    vo.setContent(content);
	    
	    
	    service.write(vo);
	    
	    
	    response.sendRedirect("../index.jsp");
	
	}


}
