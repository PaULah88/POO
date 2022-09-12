package socialNetwork;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	private List<User> listUsers = new ArrayList();

	public UserList(List<User> listUsers) {
		
		this.listUsers = listUsers;
	}

	public List<User> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}
	
	
	// Buscar un usuario
	public User findUserByName(String name) {
		User findUser = null;
		for(User user:this.listUsers) {
			if(user.getName().equals(name)) {
				findUser=user;
			}
		
		}
		return findUser;
	}

	

	

}
