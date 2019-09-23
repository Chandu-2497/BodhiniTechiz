package com.cts.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.user.model.User;

public interface UserRepository extends CrudRepository<User,Long> {

}
