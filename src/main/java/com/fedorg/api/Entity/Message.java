package com.fedorg.api.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private Long id;

    private String body;

    //TODO one to one

    private Date sendedAt;

    public Message() {
    }

    public Message(String body, Date sendedAt) {
        this.body = body;
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

    public Date getSendedAt() {
        return sendedAt;
    }

    public void setSendedAt(Date sendedAt) {
        this.sendedAt = sendedAt;
    }
}

