package org.launchcode.models;

import java.time.LocalDate;
import java.util.Date;

public class User {

    private final int id;
    private static int nextId = 1;
    private String username;
    private String email;
    private String password;
    private final LocalDate dateJoined;

    public User(String username, String email, String password) {
        this.id = nextId;
        nextId++;
        this.username = username;
        this.email = email;
        this.password = password;
        this.dateJoined = LocalDate.now();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getId() {
        return id;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }
}
