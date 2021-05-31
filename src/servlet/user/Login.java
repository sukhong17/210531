package servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import service.UserService;
import service.UserServiceImpl;
import vo.UserVO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/auth/login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
//		if(login != null) {
//            System.out.println("로그인 됨");
//            HttpSession session = request.getSession();
//            session.setAttribute("login", login);
//            getServletContext().
//            getRequestDispatcher("/index.jsp").
//            forward(request, response); 
//         } else {
//        	 System.out.println("로그인안됨");
//            request.setAttribute("msg", "로그인 실패, 로그인정보를다시 입력하세요");
//            getServletContext().
//            getRequestDispatcher("/auth/login.jsp").
//            forward(request, response);
//         }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	      request.setCharacterEncoding("utf-8");
	      
	         String id = request.getParameter("id");
	         String pw = request.getParameter("password");
	         
	         System.out.println("id = " + id + " pwd = " + pw);
	         UserDAO dao = new UserDAO();
	         UserService service = new UserServiceImpl(dao);
	         
	         UserVO login = service.login(id, pw);
	         System.out.println(login);
	         if(login != null) {
	            System.out.println("로그인 됨");
	            HttpSession session = request.getSession();
	            session.setAttribute("login", login);
	            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response); 
	         } else {
	            request.setAttribute("msg", "로그인 실패, 로그인정보를다시 입력하세요");
	            getServletContext().
	            getRequestDispatcher("/auth/login.jsp").
	            forward(request, response);
	         }
	}

}
