package org.launchcode.myblog.models;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String username;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }
}
