package com.home.demo.entity;

public class Price {
    private Integer pri_id;
    private String pri_name;
    private String  pri_price;
    private String pri_danwei;
    private String pri_bei;
    private  String ids;
    private String p_price;
    private Integer p_id;
    private String p_name;
    private Integer pi_id;

    @Override
    public String toString() {
        return "Price{" +
                "pri_id=" + pri_id +
                ", pri_name='" + pri_name + '\'' +
                ", pri_price='" + pri_price + '\'' +
                ", pri_danwei='" + pri_danwei + '\'' +
                ", pri_bei='" + pri_bei + '\'' +
                ", ids='" + ids + '\'' +
                ", p_price='" + p_price + '\'' +
                ", p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", pi_id=" + pi_id +
                '}';
    }

    public Integer getPri_id() {
        return pri_id;
    }

    public void setPri_id(Integer pri_id) {
        this.pri_id = pri_id;
    }

    public String getPri_name() {
        return pri_name;
    }

    public void setPri_name(String pri_name) {
        this.pri_name = pri_name;
    }

    public String getPri_price() {
        return pri_price;
    }

    public void setPri_price(String pri_price) {
        this.pri_price = pri_price;
    }

    public String getPri_danwei() {
        return pri_danwei;
    }

    public void setPri_danwei(String pri_danwei) {
        this.pri_danwei = pri_danwei;
    }

    public String getPri_bei() {
        return pri_bei;
    }

    public void setPri_bei(String pri_bei) {
        this.pri_bei = pri_bei;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getP_price() {
        return p_price;
    }

    public void setP_price(String p_price) {
        this.p_price = p_price;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Integer getPi_id() {
        return pi_id;
    }

    public void setPi_id(Integer pi_id) {
        this.pi_id = pi_id;
    }
}
