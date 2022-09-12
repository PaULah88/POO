package socialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

	public static void main(String[] args) {
		
		//La lista de los usuarios que forman parte de la red social
				List<User>usersList = new ArrayList<>();
				//Usuarios
				User pepe = new User("pepe");
				User manolita = new User("manolita");
				User juan = new User("juan");
				User julia = new User("julia");
				User sandra = new User("sandra");
				User diego = new User("diego");
				User carlos = new User("carlos");
				
				//seguidores de pepe
				List<User> followedpepe = new ArrayList<>();
				followedpepe.add(manolita);
				followedpepe.add(diego);
				//seguidores de manolita
				List<User> followedmanolita = new ArrayList<>();
				followedmanolita.add(juan);
				followedmanolita.add(diego);
				
				//post de pepe
				Post imagpepe = new Img(LocalDate.of(2022, 5, 4),new ArrayList<Comment>(), "Selfie.jpg", "400, 450");
				Post textpepe = new Text(LocalDate.of(2022, 4, 1), new ArrayList<Comment>(), "Hoy salí de acampada");
				List<Post> postlistpepe = new ArrayList<>();
				postlistpepe.add(imagpepe);
				postlistpepe.add(textpepe);
				
				//comentarios de diego y manolita en el post de pepe
				Comment commenttextpepediego = new Comment("Menuda suerte", LocalDate.of(2022, 4, 2), diego);
				Comment commenttextpepemanolita = new Comment("Espero que no lloviese", LocalDate.of(2022, 4, 2), manolita);
				List<Comment>commentlist = new ArrayList<>();
				commentlist.add(commenttextpepemanolita);
				commentlist.add(commenttextpepediego);
				//añadimos los comentarios al post de pepe
				textpepe.setCommentsList(commentlist);
				//añadimos la lista de post a pepe
				pepe.setPostList(postlistpepe);
				//añadimos amigos de pepe a pepe
				pepe.setFollowList(followedpepe);
				//añadimos amigos de manolita a manolita
				manolita.setFollowList(followedmanolita);
				
				//añadimos los usuarios a la lista de usuarios de la red social
				usersList.add(diego);
				usersList.add(carlos);
				usersList.add(pepe);
				usersList.add(manolita);
				usersList.add(julia);
				usersList.add(sandra);
				usersList.add(juan);
				
				
				UserList listUsers = new UserList(usersList);
				User anotherUser = new User("Mauricio");
				
				if(anotherUser.addNewUser(usersList)) {
					System.out.println("User exists");
				} 
					
					
					
				listUsers.getListUsers().add(anotherUser);
				
			

				//en el menú se llaman a las funcionalidades descritas en el pdf
				
			

	}

}
