package com.fedorg.api.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String body;

    private OneToOne sender;
    private OneToOne reciever;

    private Date sendedAt;

    public Message() {
    }

    public Message(String body, OneToOne sender, OneToOne reciever, Date sendedAt) {
        this.body = body;
        this.sender = sender;
        this.reciever = reciever;
        this.sendedAt = sendedAt;
    }

    public Message(String fuck_you_bitch, String ira, String ivan, Date sendedAt) { // created automatically for tests
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

    public OneToOne getSender() {
        return sender;
    }

    public void setSender(OneToOne sender) {
        this.sender = sender;
    }

    public OneToOne getReciever() {
        return reciever;
    }

    public void setReciever(OneToOne reciever) {
        this.reciever = reciever;
    }

    public Date getSendedAt() {
        return sendedAt;
    }

    public void setSendedAt(Date sendedAt) {
        this.sendedAt = sendedAt;
    }
}

