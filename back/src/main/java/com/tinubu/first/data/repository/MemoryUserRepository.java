package com.tinubu.first.data.repository;

import com.tinubu.first.exception.EntityNotFoundException;
import com.tinubu.first.model.*;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Pascal Lee
 */
@Repository
public class MemoryUserRepository implements UserRepository {

    private static Map<Integer, User> users = new ConcurrentHashMap<Integer, User>();

    static {
        //------- USERS
        users.put(1, new User(1, "Jean", "Bonneau", "jean.bonneau@tinubu.com", "truc", false));
        users.put(2, new User(2, "Jean-Claude", "VanDamme", "jcvd@aware.com", "bidule", true));
        users.put(3, new User(3, "Alain", "Legendre", "alain.legendre@tinubu.com", "machin", false));
        users.put(4, new User(4, "Dupont", "Martin", "dupont.martin@tinubu.com", "trucmuche", true));
    }
    
    public List<User> getUsers() {
        return  new ArrayList(users.values());
    }

    public User getUser(int userId) {
        if (users.containsKey(userId)) {
            return users.get(userId);
        }
        throw new EntityNotFoundException("Can't find any user with the user identifier " + userId);
    }

    public void updateUser(User user) {
        users.put(user.getId(), user);
    }
}
