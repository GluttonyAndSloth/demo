package com.home.demo.entity;

public class user {
    private String u_name;
    private String u_password;

    public user(String u_name, String u_password) {
        this.u_name = u_name;
        this.u_password = u_password;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    @Override
    public String toString() {
        return "user{" +
                "u_name='" + u_name + '\'' +
                ", u_password=" + u_password +
                '}';
    }

    public user() {
        super();
    }
}
