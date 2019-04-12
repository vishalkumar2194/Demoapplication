package com.example.trainingdemo.User;

public class User {

    private String Username;
    private String Password;
    private String Name;
    private String Email;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username=username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
}
