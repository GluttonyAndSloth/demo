package com.home.demo.entity;

public class pjtupian {
    private Integer tp_id;
    private String tp_url;
    private Integer e_id;

    public pjtupian(Integer tp_id, String tp_url, Integer e_id) {
        this.tp_id = tp_id;
        this.tp_url = tp_url;
        this.e_id = e_id;
    }

    public Integer getTp_id() {
        return tp_id;
    }

    public void setTp_id(Integer tp_id) {
        this.tp_id = tp_id;
    }

    public String getTp_url() {
        return tp_url;
    }

    public void setTp_url(String tp_url) {
        this.tp_url = tp_url;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    @Override
    public String toString() {
        return "pjtupian{" +
                "tp_id=" + tp_id +
                ", tp_url='" + tp_url + '\'' +
                ", e_id=" + e_id +
                '}';
    }

    public pjtupian() {
        super();
    }
}
