package socialNetwork;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	private List<User> followList = new ArrayList();
	private List<Post> postList = new ArrayList();
	public User(String name, List<User> followList, List<Post> postList) {
		
		this.name = name;
		this.followList = followList;
		this.postList = postList;
	}
	
	
	public User(String name) {
		
		this.name = name;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getFollowList() {
		return followList;
	}
	public void setFollowList(List<User> followList) {
		this.followList = followList;
	}
	public List<Post> getPostList() {
		return postList;
	}
	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
	
	
	// Añadir un nuevo usuario
	public boolean addNewUser(List<User> userList) {
	
		if(userList.contains(this)) {
			return false;
		} else {
			
			return true;
		}
		
	}
	
}










