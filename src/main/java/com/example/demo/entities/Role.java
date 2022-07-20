package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

@Entity
public class Role implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  public Long id;
	@Enumerated(EnumType.STRING)
  public ERole name;
	
	/*@ManyToMany(mappedBy= "roles")
	private List<Role> roles=new ArrayList<>();*/
/*
public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}*/
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public ERole getName() {
	return name;
}
public void setName(ERole name) {
	this.name = name;
}
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
public Role(Long id, ERole name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public int hashCode() {
	return Objects.hash(id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Role other = (Role) obj;
	return Objects.equals(id, other.id) && name == other.name;
}
@Override
public String toString() {
	return "Role [id=" + id + ", name=" + name + "]";
}
  
  
}
