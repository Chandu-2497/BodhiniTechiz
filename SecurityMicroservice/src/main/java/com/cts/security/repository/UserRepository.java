package com.cts.security.repository;

import com.cts.security.bean.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    
    public User findByUserName(String userName);
}
