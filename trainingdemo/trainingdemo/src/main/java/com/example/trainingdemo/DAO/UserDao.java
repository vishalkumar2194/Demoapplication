package com.example.trainingdemo.DAO;

import com.example.trainingdemo.User.Login;
import com.example.trainingdemo.User.User;

public interface UserDao {

    void register(User user);

    User validateUser(Login login);
}
