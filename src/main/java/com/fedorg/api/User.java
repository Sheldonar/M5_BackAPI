package com.fedorg.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String login;

    @NotBlank
    private String name;

    @NotBlank
    private String password;

    private Date createdAt;

    public User() {
    }

    public User(@NotBlank String login, @NotBlank String name, @NotBlank String password, Date createdAt) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.createdAt = createdAt;
    }

    public User(String ivan, String qwerty, Date date) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
