package com.home.demo.entity;

import java.util.Date;

public class pingjia {
    private Integer e_id;
    private String e_info;
    private Date e_time;
    private String e_person;
    private String e_image;
    private Integer p_id;
    private Integer e_ping;
    private Integer id;
    private Integer c_id;

    public pingjia(Integer e_id, String e_info, Date e_time, String e_person, String e_image, Integer p_id, Integer e_ping, Integer id, Integer c_id) {
        this.e_id = e_id;
        this.e_info = e_info;
        this.e_time = e_time;
        this.e_person = e_person;
        this.e_image = e_image;
        this.p_id = p_id;
        this.e_ping = e_ping;
        this.id = id;
        this.c_id = c_id;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getE_info() {
        return e_info;
    }

    public void setE_info(String e_info) {
        this.e_info = e_info;
    }

    public Date getE_time() {
        return e_time;
    }

    public void setE_time(Date e_time) {
        this.e_time = e_time;
    }

    public String getE_person() {
        return e_person;
    }

    public void setE_person(String e_person) {
        this.e_person = e_person;
    }

    public String getE_image() {
        return e_image;
    }

    public void setE_image(String e_image) {
        this.e_image = e_image;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public Integer getE_ping() {
        return e_ping;
    }

    public void setE_ping(Integer e_ping) {
        this.e_ping = e_ping;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    @Override
    public String toString() {
        return "pingjia{" +
                "e_id=" + e_id +
                ", e_info='" + e_info + '\'' +
                ", e_time=" + e_time +
                ", e_person='" + e_person + '\'' +
                ", e_image='" + e_image + '\'' +
                ", p_id=" + p_id +
                ", e_ping='" + e_ping + '\'' +
                ", id=" + id +
                ", c_id=" + c_id +
                '}';
    }

    public pingjia() {
        super();
    }
}
