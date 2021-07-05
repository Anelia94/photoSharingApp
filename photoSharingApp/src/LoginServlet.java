
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	/**Get usernameE info**/
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	User user = new User(username,password);
	
	LoginDao lDao = new LoginDao();
	String result = lDao.insert(user);
	
	if(result == "Username login successfully.") {
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		response.sendRedirect("welcomeUser.jsp?username="+username+"");
	
	}
	response.getWriter().print(result);
	}

}
