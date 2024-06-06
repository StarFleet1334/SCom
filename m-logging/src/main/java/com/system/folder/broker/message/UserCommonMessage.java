package com.system.folder.broker.message;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class UserCommonMessage {

    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime time;

    private String action;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "UserCommonMessage{" +
                "email='" + email + '\'' +
                ", time=" + time +
                ", action='" + action + '\'' +
                '}';
    }
}
