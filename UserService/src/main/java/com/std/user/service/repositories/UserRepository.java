package com.std.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.std.user.service.entities.User;


public interface UserRepository extends JpaRepository<User,String>{

}
