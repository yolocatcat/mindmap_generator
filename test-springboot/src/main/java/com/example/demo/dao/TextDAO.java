package com.example.demo.dao;

import com.example.demo.pojo.Text;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 猫猫
 */
public interface TextDAO extends JpaRepository<Text, Integer> {
    Text findByUsernameAndTime(String username, String time);
    List<Text> findByUsername(String username);
}
