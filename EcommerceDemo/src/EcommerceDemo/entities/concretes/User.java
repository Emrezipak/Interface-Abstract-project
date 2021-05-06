package EcommerceDemo.entities.concretes;

import EcommerceDemo.entities.abstracts.IEntity;

public class User implements IEntity {
	
	private int id;
	private String name;
	private String surname;
	private String e_Mail;
	private String password;
	public User(String name, String surname, String e_Mail, String password,int id) {
		this.name = name;
		this.surname = surname;
		this.e_Mail = e_Mail;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getE_Mail() {
		return e_Mail;
	}
	public void setE_Mail(String e_Mail) {
		this.e_Mail = e_Mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
