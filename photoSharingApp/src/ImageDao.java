
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ImageDao {
	
	public String insert(Image image) {
		JDBC jdbc = new JDBC();
		jdbc.loadDriver();
		Connection connection = jdbc.getConnection();
		System.out.println("Connection is " + connection);
		String result = "";
		String sql = "INSERT INTO IMAGES.IMAGE(image_file_name,image,title,author) VALUES(?,?,?,?)";
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			st.setString(1,image.getImage_file_name());
			st.setBlob(2,image.getImageBlob());
			st.setString(3,image.getTitle());
			st.setString(4,image.getAuthor());
			
		
				
			// Returns number of rows affected
			int rows = st.executeUpdate();
			System.out.println(rows);
			if(rows != 0) {
				result = "Image added successfully. <span><a href='myImages.jsp'>My images</a></span>";
			}else {
				result = "Failed to upload image.Please try again. <span><a href='myImages.jsp'>My images</a></span>";
			}
			
		} catch (SQLException  ex) {
			ex.printStackTrace();
			result = "Upload error.Please try again. <span><a href='myImages.jsp'>My images</a></span>";
		}

		return result;
	}
	
}
