package dao;

import java.sql.SQLException;

import model.User;

public interface IRegister {

	public User Register(String firstName, String lastName,String username, String password, String email) throws ClassNotFoundException, SQLException;

}
