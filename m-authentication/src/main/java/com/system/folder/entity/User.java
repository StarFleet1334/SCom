package com.system.folder.entity;



import jakarta.persistence.*;

import java.util.List;
import java.util.Map;

@Entity
@Table(name ="\"user\"",uniqueConstraints =
        {@UniqueConstraint(columnNames = "email")})
public class User {

    @Id
    @GeneratedValue
    private int userId;


    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

    @Column
    @OneToMany
    private List<Message> inbox;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }


    public List<Message> getInbox() {
        return inbox;
    }

    public void setInbox(List<Message> inbox) {
        this.inbox = inbox;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", inbox=" + inbox +
                '}';
    }
}