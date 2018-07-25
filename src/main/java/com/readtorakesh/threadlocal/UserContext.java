package com.readtorakesh.threadlocal;

public class UserContext {
	private String userId;
	private String firstName;
	private String lastName;

	public UserContext(String userId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "UserContext [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
