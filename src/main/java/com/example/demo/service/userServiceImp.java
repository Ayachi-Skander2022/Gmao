package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.userRepo;
@Service
public class userServiceImp implements IUserService{
	@Autowired
	userRepo ur;
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return ur.save(user);
	}

	@Override
	public User updateUser(User user, Long idUser) {
		 User u=ur.findById(idUser).get();
	        
	      u.setFullname(user.getFullname());
	      u.setEmail(user.getEmail());  
	      u.setMobile(user.getMobile());
	      u.setPassword(user.getPassword());
	      u.setConfirmpassword(user.getConfirmpassword());
		  return ur.save(u);
	}
	@Override
	public void deleteUser(Long idUser) {
		// TODO Auto-generated method stub
		ur.deleteById(idUser);
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) ur.findAll();
	}

	

	@Override
	public String addUserTestPwd(User user) {
      String msg="";
	  if(user.getPassword().equals(user.getConfirmpassword())) {
		  ur.save(user);
		  msg="user ajouté avec succés!!";
	  }else {
		msg="password invalid!!";
	}
		return msg;
	}

	@Override
	public String addUserTestEmail(User user) {
		String msg="";
	     if(ur.existsByEmail(user.getEmail())) {
	    	 msg="User existe déjat!!";
	     }
	     else {
	    	 ur.save(user);
	    	 msg="User ajouté avec succés";
	     }
			return msg;
	}



	
	
	
}
	
   

