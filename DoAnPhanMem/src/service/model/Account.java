package service.model;

import java.io.Serializable;

public class Account implements Serializable {
	String id;
	String staffId;
	String username;
	String password;
	String decentralization;
	public Account(String id, String staffId, String username, String password, String decentralization){
		this.id = id;
		this.staffId = staffId;
		this.username = username;
		this.password = password;
		this.decentralization = decentralization;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
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
	public String getDecentralization() {
		return decentralization;
	}
	public void setDecentralization(String decentralization) {
		this.decentralization = decentralization;
	}
	
}
