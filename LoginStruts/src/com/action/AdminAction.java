package com.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import com.model.*;
public class AdminAction extends ActionSupport{
	
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
	
	@Override
	public String execute() throws Exception {

		Admin admin=new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		System.out.println("in adminaction:="+username);
		System.out.println("in adminaction pwd:="+password);
		System.out.println("in valid:="+admin.isValideUser());
		if(admin.isValideUser())	{	
		return SUCCESS;
		}
		else {
			addFieldError("username", "invalid username");
			addFieldError("password", "invalid password");
			return ERROR;
		}
		
	}
	@Override
	public void addFieldError(String fieldName, String errorMessage) {
		super.addFieldError(fieldName, errorMessage);
	}
	
	
	

}
