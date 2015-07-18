package com.kellyqi.ttgl.entity;

public class RegisterInfo {
	private String familyName;
	private String password;
	private String username;
	private String mail;
	private int[] relations;
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int[] getRelations() {
		return relations;
	}
	public void setRelations(int[] relations) {
		this.relations = relations;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	
}
