


import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayAllImages")
public class DisplayAllImagesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DisplayAllImagesServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DisplayAllImagesDao data = new DisplayAllImagesDao();
		List<byte[]> bytesList = data.getAllBytes();
		
		String result = "";
		if(bytesList.isEmpty() ) {
			
		
		}else {
			response.setContentType("image/jpeg");
			
			System.out.println(bytesList.size());
			for(int index=0; index <bytesList.size(); index++) {
				System.out.println(index);
				OutputStream os = response.getOutputStream();
				os.write(bytesList.get(index));
				os.flush();
				os.close();
			}
		
		}
		response.getWriter().print(result);
		
	}

	

}
