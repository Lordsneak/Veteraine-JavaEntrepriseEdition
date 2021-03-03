package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ILogin;
import dao.DaoImp.LoginImp;
import model.User;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ILogin utilisateur;

	public void init() throws ServletException {

		utilisateur = new LoginImp();
	}

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			User rs = utilisateur.login(username, password);
			if (rs != null) {
				
				if (rs.getRole().equals("Client")) {
					
					request.getRequestDispatcher("/WEB-INF/user/user.jsp").forward(request, response);
				}
				
				else {
					if (rs.getRole().equals("Administrateur")) {
						
						request.getRequestDispatcher("/WEB-INF/admin/admin.jsp").forward(request, response);
					}
				}
			}
			else {
				System.out.print("Erreur null");
				response.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);

	}

}
