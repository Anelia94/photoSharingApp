
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/** Get usernameE info **/
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String rePass = request.getParameter("rePass");

		User user = new User(username, email, password);

		System.out.printf(password,rePass);
		/** Validate passwords **/
		if (password.equals(rePass)) {
			RegisterDao rDao = new RegisterDao();
			String result = rDao.insert(user);
			response.getWriter().print(result);
		}

		else {
			response.getWriter().print(
					"Passwords don't match.Please try again. <span><a href='registration.jsp'>Register</a></span>");
			return;
		}

	}
}
