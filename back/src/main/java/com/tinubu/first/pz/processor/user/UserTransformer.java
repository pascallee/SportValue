package com.tinubu.first.pz.processor.user;

import com.tinubu.first.model.User;
import com.tinubu.first.pz.resources.user.UserRequest;
import com.tinubu.first.pz.resources.user.UserResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pascal lee
 */
public class UserTransformer {

    public UserResponse transform2UserResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setFirstname(user.getFirstname());
        userResponse.setLastname(user.getLastname());
        userResponse.setEmail(user.getEmail());
        userResponse.setPassword(user.getPassword());
        userResponse.setAdmin(user.isIsAdmin());
        return userResponse;
    }
    
    public List<UserResponse> transform2UserResponse(List<User> userList) {
        List<UserResponse> result = new ArrayList<UserResponse>();
        for (User user : userList) {
            UserResponse userResponse = transform2UserResponse(user);
            result.add(userResponse);
        }
        return result;
    }     

    public User transform2User(UserRequest userRequest) {
        User user = new User();
        user.setId(userRequest.getId());
        user.setFirstname(userRequest.getFirstname());
        user.setLastname(userRequest.getLastname());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setIsAdmin(userRequest.getAdmin());
        return user;
    } 
}
