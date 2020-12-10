package com.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Admin {
	
	private int id;
	private String username;
	private String password;
	
	
	 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isValideUser() {
		try {
			Configuration con=new Configuration().configure();
			SessionFactory sessionFactory=con.buildSessionFactory();
			
			Session session=sessionFactory.getCurrentSession();
			Transaction transaction=session.beginTransaction();
			
			
			String hql="select a.username, a,password from admin a where a.username=:name and a.password:=pwd";
			System.out.println("inside admin befoe query:"+hql);
			Query query=session.createQuery(hql);
			query.setParameter("name", username);
			query.setParameter("pwd", password);
			
			
			List<Admin> al=query.list();
			System.out.println("in admin al:"+al.size());
			
			if(al.size()==1) {
					return true;}
			else return false;
		} catch (Exception e) {
			System.out.println("in catch"+e.getMessage());
			e.printStackTrace();
			return false;
		}
		
	}

}
