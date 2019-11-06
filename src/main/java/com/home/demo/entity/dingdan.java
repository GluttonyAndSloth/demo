package com.home.demo.entity;

import java.util.Date;

public class dingdan {
    private Integer o_id;
    private String o_name;
    private Date o_time;
    private String o_address;
    private String o_phone;
    private Integer o_price;
    private Integer o_count;
    private String o_state;
    private Integer o_total;
    private Integer id;
    private String o_paisong;
    private String o_pingjia;
    private Integer c_id;
    private Date c_xiadantime;

    public dingdan(Integer o_id, String o_name, Date o_time, String o_address, String o_phone, Integer o_price, Integer o_count, String o_state, Integer o_total, Integer id, String o_paisong, String o_pingjia, Integer c_id, Date c_xiadantime) {
        this.o_id = o_id;
        this.o_name = o_name;
        this.o_time = o_time;
        this.o_address = o_address;
        this.o_phone = o_phone;
        this.o_price = o_price;
        this.o_count = o_count;
        this.o_state = o_state;
        this.o_total = o_total;
        this.id = id;
        this.o_paisong = o_paisong;
        this.o_pingjia = o_pingjia;
        this.c_id = c_id;
        this.c_xiadantime = c_xiadantime;
    }

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public String getO_name() {
        return o_name;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public Date getO_time() {
        return o_time;
    }

    public void setO_time(Date o_time) {
        this.o_time = o_time;
    }

    public String getO_address() {
        return o_address;
    }

    public void setO_address(String o_address) {
        this.o_address = o_address;
    }

    public String getO_phone() {
        return o_phone;
    }

    public void setO_phone(String o_phone) {
        this.o_phone = o_phone;
    }

    public Integer getO_price() {
        return o_price;
    }

    public void setO_price(Integer o_price) {
        this.o_price = o_price;
    }

    public Integer getO_count() {
        return o_count;
    }

    public void setO_count(Integer o_count) {
        this.o_count = o_count;
    }

    public String getO_state() {
        return o_state;
    }

    public void setO_state(String o_state) {
        this.o_state = o_state;
    }

    public Integer getO_total() {
        return o_total;
    }

    public void setO_total(Integer o_total) {
        this.o_total = o_total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getO_paisong() {
        return o_paisong;
    }

    public void setO_paisong(String o_paisong) {
        this.o_paisong = o_paisong;
    }

    public String getO_pingjia() {
        return o_pingjia;
    }

    public void setO_pingjia(String o_pingjia) {
        this.o_pingjia = o_pingjia;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Date getC_xiadantime() {
        return c_xiadantime;
    }

    public void setC_xiadantime(Date c_xiadantime) {
        this.c_xiadantime = c_xiadantime;
    }

    @Override
    public String toString() {
        return "dingdan{" +
                "o_id=" + o_id +
                ", o_name='" + o_name + '\'' +
                ", o_time=" + o_time +
                ", o_address='" + o_address + '\'' +
                ", o_phone='" + o_phone + '\'' +
                ", o_price=" + o_price +
                ", o_count=" + o_count +
                ", o_state='" + o_state + '\'' +
                ", o_total=" + o_total +
                ", id=" + id +
                ", o_paisong='" + o_paisong + '\'' +
                ", o_pingjia='" + o_pingjia + '\'' +
                ", c_id=" + c_id +
                ", c_xiadantime=" + c_xiadantime +
                '}';
    }

    public dingdan() {
        super();
    }
}
