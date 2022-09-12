package socialNetwork;

import java.time.LocalDate;
import java.util.List;


public class Video extends Post {
	
	private String title;
	private String quality;
	private int seconds;
	public Video(LocalDate date, List<Comment> commentsList, String title, String quality, int seconds) {
		super(date, commentsList);
		this.title = title;
		this.quality = quality;
		this.seconds = seconds;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	

	
}
