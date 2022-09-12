package socialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
	protected LocalDate date;
	protected List<Comment> commentsList = new ArrayList();
	public Post(LocalDate date, List<Comment> commentsList) {
		
		this.date = date;
		this.commentsList = commentsList;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<Comment> getCommentsList() {
		return commentsList;
	}
	public void setCommentsList(List<Comment> commentsList) {
		this.commentsList = commentsList;
	}
	
	
	
	
	//ArrayList<Double> commentsList;
	//public Post() {
	//	commentsList=new ArrayList<>();
	//}
	
	//metodo xa añadir un comentario al post
	//public void savePost(double p) {
	//	commentsList.add(p);
	//}
	
	// Esto va aquí o debería ir mas arriba??
	
	

}
