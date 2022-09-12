package socialNetwork;

import java.time.LocalDate;

public class Comment {
	private String text;
	private LocalDate date;
	private User userOwner;
	public Comment(String text, LocalDate date, User userOwner) {
	
		this.text = text;
		this.date = date;
		this.userOwner = userOwner;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public User getUserOwner() {
		return userOwner;
	}
	public void setUserOwner(User userOwner) {
		this.userOwner = userOwner;
	}
	
	
	


}
