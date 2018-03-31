package serialization;

import java.io.Serializable;

public class User_Serializable implements Serializable//java.io.Serializable
{
	String username;
	String password;
	public User_Serializable(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	

}
