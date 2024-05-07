package com.smarttech.app.beans;

/**
*
* @author Garrik Brel
*/
public class User { 

    private int userId;
    private String name;
    private String userEmail;
    private String password;

    public User(int userId, String name, String password, String userMail){
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.userEmail = userMail;
    }

    protected User(){}

    public Integer getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
