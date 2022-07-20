package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.IUserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class userController {
@Autowired
	
	IUserService userService;

@PostMapping("/addUser")
public User addPanne(@RequestBody User user) {
	return userService.addUser(user);
}

@PostMapping("/addTestEmail")
public String addTestEmail (@RequestBody User user) {
	return userService.addUserTestEmail(user);
}


@PutMapping("/updateUser/{id}")
public User updateUser(@RequestBody User user,@PathVariable("id") Long idUser) {
	return userService.updateUser(user, idUser);
}

@DeleteMapping("/deleteUser/{id}")
public String deleteUser(@PathVariable("id") Long idUser) {
	String msg="";
	userService.deleteUser(idUser);
	return msg;
}
@GetMapping("/findAllUser")
public List<User> findAll(){
	return userService.findAll();
}

@PostMapping("/addTestPwd")
public String addTestPwd(@RequestBody User user) {
	return userService.addUserTestPwd(user);
}
}
