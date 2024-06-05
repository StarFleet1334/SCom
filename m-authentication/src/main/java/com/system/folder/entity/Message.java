package com.system.folder.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Message")
public class Message {

    @Id
    @GeneratedValue
    private int message_id;

    @Column
    private String sender;


    @Column
    private String message;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", user=" + user +
                '}';
    }
}
