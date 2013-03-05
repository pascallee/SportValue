package com.tinubu.first.model;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;

/**
 * @author Pascal Lee
 */
public class User {

    private int id;

    @NotNull
    private String firstname;

    @NotNull
    private String lastname;

    @Email
    private String email;
    
    @NotNull
    private String password;
    
    private boolean isAdmin;
	
    public User() {
    }

    public User(int id, String firstname, String lastname, String email, String password, boolean isAdmin) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
