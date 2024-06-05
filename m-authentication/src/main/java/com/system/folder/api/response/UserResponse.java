package com.system.folder.api.response;

public class UserResponse {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "description='" + description + '\'' +
                '}';
    }
}