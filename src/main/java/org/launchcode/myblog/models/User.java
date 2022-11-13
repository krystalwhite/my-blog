package org.launchcode.myblog.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String username;

    @OneToMany(mappedBy = "user")
    private List<Blog> posts = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Blog> getPosts() {
        return posts;
    }
}
