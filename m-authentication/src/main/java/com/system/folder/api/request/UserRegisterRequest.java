package com.system.folder.api.request;

import java.util.List;

public class UserRegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<MessageRequest> inbox;

    public String getFirstName() {
        return firstName;
    }

    public List<MessageRequest> getInbox() {
        return inbox;
    }

    public void setInbox(List<MessageRequest> inbox) {
        this.inbox = inbox;
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
        return "UserRegisterRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", inbox=" + inbox +
                '}';
    }
}
