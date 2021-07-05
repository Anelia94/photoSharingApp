

import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DisplayAllImagesDao {
	
	public List<byte[]> getAllBytes() {

		JDBC jdbc = new JDBC();
		jdbc.loadDriver();
		Connection connection = jdbc.getConnection();
		System.out.println("Connection is " + connection);
		
		String sql = "SELECT * FROM IMAGES.IMAGE";
		
		List<byte[]> getBytes = new ArrayList<byte[]>();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);

		
			while (rs.next()) {
				rs.getString("image_file_name");
				Blob blob = rs.getBlob("image");
				byte byteArray[] = blob.getBytes(1, (int)blob.length());
				getBytes.add(byteArray);				
			}
			
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return getBytes;
	}
}
