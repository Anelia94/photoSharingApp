

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/AddImage")
public class AddImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddImageServlet() {
		super();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		Part file = request.getPart("image");
		String imageFileName = (file.getSubmittedFileName()).substring(19);
		String uploadPath = "C:/Users/Nelly/workspace/photoSharingApp/images/" + imageFileName;
		String title = request.getParameter("text");
		InputStream imageBlob = file.getInputStream();
		

		try {
			FileOutputStream fos = new FileOutputStream(uploadPath);
			InputStream is = file.getInputStream();

			byte[] data = new byte[is.available()];
			is.read(data);
			fos.write(data);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
		HttpSession session = request.getSession();
		String author =  (String) session.getAttribute("username");

		System.out.println(author);
		
		Image image = new Image(imageFileName,imageBlob,title,author);
		ImageDao iDao = new ImageDao();
		String result = iDao.insert(image);
		response.getWriter().print(result);

	}
	
}
