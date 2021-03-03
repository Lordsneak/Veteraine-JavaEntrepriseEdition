package main;

import model.User;
import service.Services;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id = 2;
		Services s = new Services();
		User u = new User("Hamza","Ghounbaz","Hamza Cullen ID 2","easy123","Hamza@gmail.com","Client","2007/06/02");
		s.addUser(u);
		//s.updateUser(u);
		//s.DeleteUser(id);
		//s.getByIdUser(id);
		//s.getAllUser();
	}

}
