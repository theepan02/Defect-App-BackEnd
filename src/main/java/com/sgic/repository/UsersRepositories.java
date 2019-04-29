package com.sgic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.entity.Users;


public interface UsersRepositories extends JpaRepository <Users, Long> {
	Users findUsersById(int id);				//	ID Search
	

}
