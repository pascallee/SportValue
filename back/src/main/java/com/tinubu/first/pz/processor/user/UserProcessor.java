package com.tinubu.first.pz.processor.user;

import com.tinubu.first.pz.resources.user.*;

import java.util.List;
import org.springframework.integration.annotation.Payload;

/**
 * @author Pascal Lee
 */
public interface UserProcessor {
    
    @Payload("new java.util.Date()")
    public List<UserResponse> getUsers();

    public UserResponse getUser(int userId);

    public void updateUser(UserRequest request);
}
