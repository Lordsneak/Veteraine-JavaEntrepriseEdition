package dao.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Database.DbConnect;
import dao.ILogin;
import model.User;



public class LoginImp implements ILogin {

	Statement statement = null;
	public static long id_Session = 0;
	
	@Override
	public User login( String userName,String password) throws ClassNotFoundException, SQLException {
		User utilisateur = null;
		try {
			String query = "SELECT * FROM public.users where username=? and password=?";
			Connection con = DbConnect.getConnect();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			
			
			if (rs.next()) {
				if (rs.getString(7).equals("Administrateur")) {
					utilisateur = new User(rs.getString(2),rs.getString(3),userName, password, rs.getString(6), rs.getString(7),rs.getString(8));
					id_Session = (rs.getLong(1));
				} else {
					if (rs.getString(7).equals("Client")) {
						utilisateur = new User(rs.getString(2),rs.getString(3),userName, password, rs.getString(6), rs.getString(7),rs.getString(8));
						id_Session = (rs.getInt(1));
					}
				}	
				utilisateur.setUserId((rs.getLong(1)));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return utilisateur;
		
	}
	
	
}
