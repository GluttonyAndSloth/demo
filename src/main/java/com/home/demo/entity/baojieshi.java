package com.home.demo.entity;

import java.util.Date;

public class baojieshi {
    private Integer c_id;
    private String c_name;
    private Integer c_age;
    private String c_sex;
    private Date c_birthday;
    private String c_address;
    private String c_work;
    private String c_state;
    private Integer si_id;
    private String c_image;
    private String c_status;

    public baojieshi(Integer c_id, String c_name, Integer c_age, String c_sex, Date c_birthday, String c_address, String c_work, String c_state, Integer si_id, String c_image, String c_status) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_age = c_age;
        this.c_sex = c_sex;
        this.c_birthday = c_birthday;
        this.c_address = c_address;
        this.c_work = c_work;
        this.c_state = c_state;
        this.si_id = si_id;
        this.c_image = c_image;
        this.c_status = c_status;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public Integer getC_age() {
        return c_age;
    }

    public void setC_age(Integer c_age) {
        this.c_age = c_age;
    }

    public String getC_sex() {
        return c_sex;
    }

    public void setC_sex(String c_sex) {
        this.c_sex = c_sex;
    }

    public Date getC_birthday() {
        return c_birthday;
    }

    public void setC_birthday(Date c_birthday) {
        this.c_birthday = c_birthday;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public String getC_work() {
        return c_work;
    }

    public void setC_work(String c_work) {
        this.c_work = c_work;
    }

    public String getC_state() {
        return c_state;
    }

    public void setC_state(String c_state) {
        this.c_state = c_state;
    }

    public Integer getSi_id() {
        return si_id;
    }

    public void setSi_id(Integer si_id) {
        this.si_id = si_id;
    }

    public String getC_image() {
        return c_image;
    }

    public void setC_image(String c_image) {
        this.c_image = c_image;
    }

    public String getC_status() {
        return c_status;
    }

    public void setC_status(String c_status) {
        this.c_status = c_status;
    }

    @Override
    public String toString() {
        return "baojieshi{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_age=" + c_age +
                ", c_sex='" + c_sex + '\'' +
                ", c_birthday=" + c_birthday +
                ", c_address='" + c_address + '\'' +
                ", c_work='" + c_work + '\'' +
                ", c_state='" + c_state + '\'' +
                ", si_id=" + si_id +
                ", c_image='" + c_image + '\'' +
                ", c_status='" + c_status + '\'' +
                '}';
    }

    public baojieshi() {
        super();
    }
}
