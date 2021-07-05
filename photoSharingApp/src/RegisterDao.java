import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	
	public String insert(User user) {
		JDBC jdbc = new JDBC();
		jdbc.loadDriver();
		Connection connection = jdbc.getConnection();
		System.out.println("Connection is " + connection);
		
		String 	result = "";
		String sql = "INSERT INTO USERS.USER(username,email,password) VALUES (?,?,?)";
		
		try {
		PreparedStatement st =connection.prepareStatement(sql);
		st.setString(1,user.getUsername());
		st.setString(2,user.getEmail());
		st.setString(3,user.getPassword());
		st.executeUpdate();
		
		result= "Registration Successful.  <span><a href='login.jsp'>LogIn</a></span>";
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			
			result = "Data not entered.Please try again <span><a href='registration.jsp'>Register</a></span>";
		}
		
		
		return result;
	}
}
