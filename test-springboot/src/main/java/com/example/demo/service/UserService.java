package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author 猫猫
 */
@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public User getByName(String username){
        return userDAO.findByUsername(username);
    }

    public boolean isExist(String username){
        User user = getByName(username);
        return null != user;
    }

    public User get(String username, String password){
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user){
        userDAO.save(user);
    }


}
