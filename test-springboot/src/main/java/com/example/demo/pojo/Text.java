package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

/**
 * @author 猫猫
 */

@Entity
@Table(name = "text")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    int id;
    String mdContent;
    String username;
    String time;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }


    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setMdContent(String mdContent) {
        this.mdContent = mdContent;
    }

    public String getMdContent() {
        return mdContent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
