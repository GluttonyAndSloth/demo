package com.home.demo.entity;

public class TuiKuaiShenHe {
    private int id;
    private String phone;
    private int b_id;
    private String b_name;
    private String b_number;
    private String b_money;
    private String b_state;
    private int o_id;
    private String o_name;
    private String o_time;
    private String o_total;
    private String o_paisong;
    private int t_id;
    private String t_reason;
    private String t_state;

    @Override
    public String toString() {
        return "TuiKuaiShenHe{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", b_id=" + b_id +
                ", b_name='" + b_name + '\'' +
                ", b_number='" + b_number + '\'' +
                ", b_money='" + b_money + '\'' +
                ", b_state='" + b_state + '\'' +
                ", o_id=" + o_id +
                ", o_name='" + o_name + '\'' +
                ", o_time='" + o_time + '\'' +
                ", o_state='" + o_total + '\'' +
                ", o_paisong='" + o_paisong + '\'' +
                ", t_id=" + t_id +
                ", t_reason='" + t_reason + '\'' +
                ", state='" + t_state + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_number() {
        return b_number;
    }

    public void setB_number(String b_number) {
        this.b_number = b_number;
    }

    public String getB_money() {
        return b_money;
    }

    public void setB_money(String b_money) {
        this.b_money = b_money;
    }

    public String getB_state() {
        return b_state;
    }

    public void setB_state(String b_state) {
        this.b_state = b_state;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public String getO_name() {
        return o_name;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public String getO_time() {
        return o_time;
    }

    public void setO_time(String o_time) {
        this.o_time = o_time;
    }

    public String getO_total() {
        return o_total;
    }

    public void setO_total(String o_total) {
        this.o_total = o_total;
    }

    public String getO_paisong() {
        return o_paisong;
    }

    public void setO_paisong(String o_paisong) {
        this.o_paisong = o_paisong;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_reason() {
        return t_reason;
    }

    public void setT_reason(String t_reason) {
        this.t_reason = t_reason;
    }

    public String gett_state() {
        return t_state;
    }

    public void setT_state(String t_state) {
        this.t_state = t_state;
    }
}
