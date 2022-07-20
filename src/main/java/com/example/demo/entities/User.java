package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUser;
	private String fullname;
	private String mobile;
	private String email;
	private String password;
	private String confirmpassword;
	/*
	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name =  "idUser"), inverseJoinColumns = @JoinColumn(name = "idRole"))
	private List<Role> roles = new ArrayList<>();*/
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long idUser, String fullname, String mobile, String email, String password, String confirmpassword) {
		super();
		this.idUser = idUser;
		this.fullname = fullname;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	/*
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}*/
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public int hashCode() {
		return Objects.hash(confirmpassword, email, fullname, idUser, mobile, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(confirmpassword, other.confirmpassword) && Objects.equals(email, other.email)
				&& Objects.equals(fullname, other.fullname) && Objects.equals(idUser, other.idUser)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", fullname=" + fullname + ", mobile=" + mobile + ", email=" + email
				+ ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
	}
	
	
}
