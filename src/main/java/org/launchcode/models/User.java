package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min = 5, max = 15)
    private String username;

    @NotBlank
    private String verify;

    @Email
    private String email;

    @NotBlank
    @Size(min = 6)
    private String password;

    public User() {

    }

    public User(String username, String verify, String email, String password) {
        this();
        this.username = username;
        this.verify = verify;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public @NotBlank String getVerify() {
        return verify;
    }

    public void setVerify(@NotBlank String verify) {
        this.verify = verify;
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
}

