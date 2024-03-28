package com.vamsi.springsecdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vamsi.springsecdemo.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
