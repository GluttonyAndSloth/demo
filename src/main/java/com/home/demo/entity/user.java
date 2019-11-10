package com.home.demo.entity;

public class user {
    private Integer u_id;
    private String u_name;
    private String u_password;
    private String u_sex;
    private Integer u_age;
    private String u_img;
    private String u_address;
    private String u_status;
    private String r_name;
    private Integer r_id;

    public user(Integer u_id, String u_name, String u_password, String u_sex, Integer u_age, String u_img, String u_address, String u_status, String r_name, Integer r_id) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_password = u_password;
        this.u_sex = u_sex;
        this.u_age = u_age;
        this.u_img = u_img;
        this.u_address = u_address;
        this.u_status = u_status;
        this.r_name = r_name;
        this.r_id = r_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
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

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public Integer getU_age() {
        return u_age;
    }

    public void setU_age(Integer u_age) {
        this.u_age = u_age;
    }

    public String getU_img() {
        return u_img;
    }

    public void setU_img(String u_img) {
        this.u_img = u_img;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public String getU_status() {
        return u_status;
    }

    public void setU_status(String u_status) {
        this.u_status = u_status;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    @Override
    public String toString() {
        return "user{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_age=" + u_age +
                ", u_img='" + u_img + '\'' +
                ", u_address='" + u_address + '\'' +
                ", u_status='" + u_status + '\'' +
                ", r_name='" + r_name + '\'' +
                ", r_id=" + r_id +
                '}';
    }

    public user() {
        super();
    }
}
