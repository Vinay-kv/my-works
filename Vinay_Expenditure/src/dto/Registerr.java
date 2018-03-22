package dto;

public class Registerr
{
	private String database;
	private String name;
	private String pass1;
	private String pass2;
	private String email;
	private String date;
	private String food1;
	private String food2;
	private String food3;
	

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPass1() {
		return pass1;
	}



	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}



	public String getPass2() {
		return pass2;
	}



	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getFood1() {
		return food1;
	}



	public void setFood1(String food1) {
		this.food1 = food1;
	}



	public String getFood2() {
		return food2;
	}



	public void setFood2(String food2) {
		this.food2 = food2;
	}



	public String getFood3() {
		return food3;
	}



	public void setFood3(String food3) {
		this.food3 = food3;
	}



	@Override
	public String toString() {
		return "Register [name=" + name + ", pass1=" + pass1 + ", pass2=" + pass2 + ", email=" + email + ", date="
				+ date + ", food1=" + food1 + ", food2=" + food2 + ", food3=" + food3 + ", getName()=" + getName()
				+ ", getPass1()=" + getPass1() + ", getPass2()=" + getPass2() + ", getEmail()=" + getEmail()
				+ ", getDate()=" + getDate() + ", getFood1()=" + getFood1() + ", getFood2()=" + getFood2()
				+ ", getFood3()=" + getFood3() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
