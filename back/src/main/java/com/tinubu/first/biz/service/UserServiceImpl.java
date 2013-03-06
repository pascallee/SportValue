package com.tinubu.first.biz.service;

import com.tinubu.first.data.repository.UserRepository;
import com.tinubu.first.model.*;

import java.util.List;

/**
 * @author Pascal Lee
 */

public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }
    
    public List<User> getUsers() {
        return repository.getUsers();
    }

    public User getUser(int UserId) {
        return repository.getUser(UserId);
    }

    public void updateUser(User user) {
        repository.updateUser(user);
    }
    
    public void createUser(User user) {
        repository.createUser(user);
    }
}
