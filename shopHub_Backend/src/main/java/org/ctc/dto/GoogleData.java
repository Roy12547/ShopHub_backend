package org.ctc.dto;

public class GoogleData {
    private String email;

    private String picture;

    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GoogleData{" +
                "email='" + email + '\'' +
                ", picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
