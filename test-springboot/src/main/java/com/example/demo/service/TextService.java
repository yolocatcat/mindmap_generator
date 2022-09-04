package com.example.demo.service;

import com.example.demo.pojo.Text;
import com.example.demo.dao.TextDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextService {
    @Autowired
    TextDAO textDAO;
    public Text getByUsernameAndTime(String username, String time){
        return textDAO.findByUsernameAndTime(username, time);
    }
    public List<Text> getByUsername(String username){
        return textDAO.findByUsername(username);
    }
    public void add(Text text){
        textDAO.save(text);
    }
    public void delete(Text text){
        textDAO.delete(text);
    }
}
