package SalesGame;

public class Gamer {
	
	private String name;
	private String surname;
	private String nationalityId;
	private int age;
	
	public Gamer(String name, String surname, String nationalityId, int age) {
		this.name = name;
		this.surname = surname;
		this.nationalityId = nationalityId;
		this.age = age;
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
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
