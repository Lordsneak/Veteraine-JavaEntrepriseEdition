package dao;

import java.sql.SQLException;

import model.User;



public interface ILogin {
	public  User login(String email, String password)throws ClassNotFoundException, SQLException;
}
