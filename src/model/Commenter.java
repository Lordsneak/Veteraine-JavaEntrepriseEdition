package model;

public class Commenter {

	private Long commenterId;
	private String subject;
	private User User;
	
	
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	public Long getCommenterId() {
		return commenterId;
	}
	public void setCommenterId(Long commenterId) {
		this.commenterId = commenterId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Commenter(String subject) {
		super();
		this.subject = subject;
	}
	public Commenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Commenter [commenterId=" + commenterId + ", subject=" + subject + "]";
	}
	
	
	
}
