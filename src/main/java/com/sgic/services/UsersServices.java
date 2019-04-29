package com.sgic.services;

import java.util.List;
import com.sgic.entity.Users;

public interface UsersServices {
	
	void saveUsers(Users users);		//	Save Users
	List<Users> getAllUsers();			//	Get All Users
//	Users getUsersById(Long id);			//	Get Users By ID
//	Users deleteUsersById(Long id);		//	Delete Users
//	void updateUsers(Users users);		//	Update Users

}
