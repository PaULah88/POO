package socialNetwork;

import java.time.LocalDate;
import java.util.List;

public class Img extends Post {
	
	private String title;
	private String dimensions;
	public Img(LocalDate date, List<Comment> commentsList, String title, String dimensions) {
		super(date, commentsList);
		this.title = title;
		this.dimensions = dimensions;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDimensions() {
		return dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	
	



}
