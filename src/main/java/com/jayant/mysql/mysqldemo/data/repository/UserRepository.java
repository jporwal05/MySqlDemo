package com.jayant.mysql.mysqldemo.data.repository;

import com.jayant.mysql.mysqldemo.data.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
