package socialNetwork;

import java.time.LocalDate;
import java.util.List;

public class Text extends Post {
	private String text;

	public Text(LocalDate date, List<Comment> commentsList, String text) {
		super(date, commentsList);
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
}
