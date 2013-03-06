package com.tinubu.first.data.repository;

import com.tinubu.first.model.User;

import java.util.List;

/**
 * @author Pascal Lee
 */
public interface UserRepository {
    
    public List<User> getUsers();

    public User getUser(int userId);

    public void updateUser(User user);
    
    public void createUser(User user);
}
