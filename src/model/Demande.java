package model;

import java.util.Date;

public class Demande {
	
	private Long demandeId;
	private String fullname;
	private String tel;
	private String email;
	private String typeanimal;
	private String myDate;
	private User User;
	
	
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	public Long getDemandeId() {
		return demandeId;
	}
	public void setDemandeId(Long demandeId) {
		this.demandeId = demandeId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTypeanimal() {
		return typeanimal;
	}
	public void setTypeanimal(String typeanimal) {
		this.typeanimal = typeanimal;
	}
	public String getMyDate() {
		return myDate;
	}
	public void setMyDate(String myDate) {
		this.myDate = myDate;
	}
	@Override
	public String toString() {
		return "Demande [demandeId=" + demandeId + ", fullname=" + fullname + ", tel=" + tel + ", email=" + email
				+ ", typeanimal=" + typeanimal + ", myDate=" + myDate + "]";
	}
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demande(String fullname, String tel, String email, String typeanimal, String myDate) {
		super();
		this.fullname = fullname;
		this.tel = tel;
		this.email = email;
		this.typeanimal = typeanimal;
		this.myDate = myDate;
	}

	
	
	

	

	
	
	
	
}
