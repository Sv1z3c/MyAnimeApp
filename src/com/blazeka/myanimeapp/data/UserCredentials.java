package com.blazeka.myanimeapp.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Credentials")
public class UserCredentials extends Model
{
	@Column(name = "Username")
	private String username;
	@Column(name = "Password")
	private String password;
	
	public UserCredentials()
	{
		super();
	}

	public UserCredentials(String username, String password)
	{
		super();
		this.username = username;
		this.password = password;
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
}
