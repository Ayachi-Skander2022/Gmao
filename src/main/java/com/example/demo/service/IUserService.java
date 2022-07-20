package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.User;

public interface IUserService {
	public User addUser(User user);
	public String addUserTestEmail(User user);
	public User updateUser(User user, Long idUser);
	public void deleteUser (Long idUser);
	public List<User> findAll();
	public String addUserTestPwd(User user);

}
