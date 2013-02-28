package com.tinubu.first.pz.resources.user;

import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;

/**
 * @author Pascal Lee
 */
public class UserRequest {

    private int id;

    @NotNull
    private String firstname;

    @NotNull
    private String lastname;
    
    @Email
    private String email;
    
    @NotNull
    private String password;
    
    private boolean admin;


    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
