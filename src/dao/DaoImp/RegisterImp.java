package dao.DaoImp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Database.DbConnect;
import dao.IRegister;
import model.User;

public class RegisterImp implements IRegister{

	@Override
	public User Register(String firstName, String lastName, String username, String password, String email)
			throws ClassNotFoundException, SQLException {
		User user = null;
		String requete="INSERT INTO public.users(\r\n" + 
				"	 firstname, lastname, username, password, email, role)\r\n" + 
				"	VALUES (?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement statement = DbConnect.getConnect().prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
		statement.setString(1, firstName);
		statement.setString(2, lastName);
		statement.setString(3, username);
		statement.setString(4, password);
		statement.setString(5, email);
		statement.setString(6, "Client");
		statement.executeUpdate();
		
		user = new User(firstName,lastName,username, password, email);
		
		return user;
	}


}
