package com.fedorg.api.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private Long id;

    private String body;

    @JsonIgnore
    @ManyToOne
    private Users sender;

    @JsonIgnore
    @ManyToOne
    private Users recipient;

    private Date sendedAt;

    public Message() {
    }

    public Message(String body, Date sendedAt) {
        this.body = body;
        this.sendedAt = sendedAt;
    }

    public Message(String body, Users sender, Users recipient, Date sendedAt) {
        this.body = body;
        this.sender = sender;
        this.recipient = recipient;
        this.sendedAt = sendedAt;
    }

    public Users getSender() {
        return sender;
    }

    public void setSender(Users sender) {
        this.sender = sender;
    }

    public Users getRecipient() {
        return recipient;
    }

    public void setRecipient(Users recipient) {
        this.recipient = recipient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getSendedAt() {
        return sendedAt;
    }

    public void setSendedAt(Date sendedAt) {
        this.sendedAt = sendedAt;
    }
}

