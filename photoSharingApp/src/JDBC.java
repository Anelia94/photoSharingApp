import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
	private String dbUrl="jdbc:mysql://localhost:3306/users";
	private String dbuname="root"; 
	private String dbpass="*****";
	private String dbDriver="com.mysql.cj.jdbc.Driver";
	
	
	public void loadDriver() {
		try {
			Class.forName(dbDriver);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		
		}
	}
	
	public Connection getConnection() {
		Connection dbConnection = null;
		try{
			  dbConnection=DriverManager.getConnection(dbUrl,dbuname,dbpass);
			}
			catch( SQLException e ){
			    e.printStackTrace();
			}
		return dbConnection;
	}

}
