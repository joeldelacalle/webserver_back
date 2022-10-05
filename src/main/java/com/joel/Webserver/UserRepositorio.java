package com.joel.Webserver;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface UserRepositorio extends Repository<User, Integer> {
    List<User> findAll();
//    User findOne(int id);
    User save(User u);
//    void delete(User u);
}