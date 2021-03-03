package service;

import java.util.List;

import org.hibernate.Session;

import model.Demande;
import model.User;
import util.HibernateUtil;

public class Services {
	List<User> listofusers = null;
	List<Demande> listofdemande = null;
	
	public void addUser(User u) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
	}
	
	public void updateUser(User u) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(u);
		session.getTransaction().commit();
	}
	
	public List<User> getAllUser() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<User> listofusers = session.createQuery("from User", User.class).getResultList();
		session.getTransaction().commit();
		return listofusers;
	}
	
	public User getByIdUser(long userId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User userid = session.get(User.class, userId);
		session.getTransaction().commit();
		return userid;
	}
	
	public List<User> searchUser(String mc) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		return listofusers;
	}
	
	public void DeleteUser(Long userId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User user = session.get(User.class, userId);
		session.delete(user);
		session.getTransaction().commit();
	}

	// Partie Demande Rendez-vous
	
	public void addDemande(Demande d) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(d);
		session.getTransaction().commit();
	}
	
	public void updateDemande(Demande d) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(d);
		session.getTransaction().commit();
	}
	
	public void deleteDemande(Long demande_id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Demande demande = session.get(Demande.class, demande_id);
		session.delete(demande);
		session.getTransaction().commit();
	}
	
	public List<Demande> getAllDamande() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Demande> listofdemande = session.createQuery("from Demande", Demande.class).getResultList();
		return listofdemande;
	}
	
	public Demande getByIdDemande(Long demandeId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Demande demandeid = session.get(Demande.class, demandeId);
		session.getTransaction().commit();
		return demandeid;
	}
	
/*	public void addDemandetoUser(Long idU, Long idD) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		User u = session.load(User.class, idU);
		Demande d = session.load(Demande.class, idD);
		
		u.getDemandes().add(d);
		
		session.getTransaction().commit();
		
	}*/
}
