package com.fedorg.api.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private Long id;

    private String login;

    private String name;

    private String password;

    private Date createdAt;

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL)
    private List<Message> sendedMessages = new ArrayList<>();

    @OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL)
    private List<Message> recievedMessages = new ArrayList<>();


    public Users() {
    }

    public Users(String login, String name, String password, Date createdAt) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.createdAt = createdAt;
    }

    public List<Message> getSendedMessages() {
        return sendedMessages;
    }

    public void setSendedMessages(List<Message> sendedMessages) {
        this.sendedMessages = sendedMessages;
    }

    public List<Message> getRecievedMessages() {
        return recievedMessages;
    }

    public void setRecievedMessages(List<Message> recievedMessages) {
        this.recievedMessages = recievedMessages;
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
