package com.tinubu.first.biz.service;

import com.tinubu.first.model.*;

import java.util.List;

/**
 * @author Pascal Lee
 */
public interface UserService {

    public List<User> getUsers();
    
    public User getUser(int userId);

    public void updateUser(User user);
}
