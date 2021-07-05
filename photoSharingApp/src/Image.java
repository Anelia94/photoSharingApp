import java.io.InputStream;

public class Image {
	private String image_file_name;
	private InputStream imageBlob;
	private String title;
	private String author;

	public Image() {
		super();
	}
	
	public Image(String image_file_name, InputStream imageBlob,String title, String author) {
		super();
		this.image_file_name = image_file_name;
		this.imageBlob=imageBlob;
		this.title = title;
		this.author = author;
	}


	public String getImage_file_name() {
		return image_file_name;
	}

	public void setImage_file_name(String image_file_name) {
		this.image_file_name = image_file_name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public InputStream getImageBlob() {
		return imageBlob;
	}

	public void setImageBlob(InputStream imageBlob) {
		this.imageBlob = imageBlob;
	}

}
