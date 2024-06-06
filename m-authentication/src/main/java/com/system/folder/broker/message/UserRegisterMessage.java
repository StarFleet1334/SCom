package com.system.folder.broker.message;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class UserRegisterMessage {

    private String email;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime registerTime;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(LocalDateTime registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "UserRegisterMessage{" +
                "email='" + email + '\'' +
                ", registerTime=" + registerTime +
                '}';
    }
}
