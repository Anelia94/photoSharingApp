import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDao  {

	public String insert(User user) {
		JDBC jdbc = new JDBC();
		jdbc.loadDriver();
		Connection connection = jdbc.getConnection();
		System.out.println("Connection is " + connection);
		String result = "";
		String sql = "SELECT * FROM USERS.USER WHERE USERNAME = ? AND PASSWORD = ?";
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			st.setString(1, user.getUsername());
			st.setString(2, user.getPassword());
			ResultSet rs = st.executeQuery();
			boolean haveAcc = rs.next();

			if (haveAcc == true) {
				result = "Username login successfully.";
			} else {
				result = "Incorrect username or password.Please try again.<span><a href='login.jsp'>LogIn</a></span>";
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			result = "Data not login";
		}

		return result;
	}
}
