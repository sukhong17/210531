package servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import service.UserService;
import service.UserServiceImpl;
import vo.UserVO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/auth/register.do")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    
	    
	    String id = request.getParameter("id");
	    String name = request.getParameter("name");
	    String password = request.getParameter("password");
	    String tel = request.getParameter("tel");
	    String email = request.getParameter("email");
	    int level = 1;
	    
	    UserVO vo = new UserVO();
	    vo.setId(id);	
	    vo.setName(name);
	    vo.setPassword(password);
	    vo.setTel(tel);
	    vo.setEmail(email);
	    vo.setLevel(level);
	    
	    UserDAO dao = new UserDAO();
	    UserService service = new UserServiceImpl(dao);
	    
	    service.register(vo);
	    
	    
	    
	    
	    
	}

}
