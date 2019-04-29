package com.sgic.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.entity.Users;
import com.sgic.repository.UsersRepositories;


@Service
public class UsersServicesImplementation implements UsersServices {
	
	@Autowired
	UsersRepositories usersRepositories;
	
	public void saveUsers(Users users) {
		usersRepositories.save(users);
	}
	
	public List<Users> getAllUsers(){
		return usersRepositories.findAll();
	}
	
//	@Override
//	public Users getUsersById(Long id){
//		return usersRepositories.findUsersById(id);
//	}
//	
//	
//	public Users deleteUsersById(Long id) {
//		usersRepositories.deleteById(id);
//		 return null;
//	}
//	
//	@Override
//	public void updateUsers(Users users) {
//		Long Id = users.getId();
//		boolean isExist = usersRepositories.findUsersById(Id) != null;
//		if(isExist) {
//			usersRepositories.save(users);
//		}
//		}
//
//	@Override
//	public Users deleteUsersById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	


}
