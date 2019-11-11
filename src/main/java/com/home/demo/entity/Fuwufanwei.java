package com.home.demo.entity;

public class Fuwufanwei {
    private Integer sf_id;
    private String sf_name;
    private Integer p_id;
    private String p_name;

    @Override
    public String toString() {
        return "Fuwufanwei{" +
                "sf_id=" + sf_id +
                ", sf_name='" + sf_name + '\'' +
                ", p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                '}';
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Integer getSf_id() {
        return sf_id;
    }

    public void setSf_id(Integer sf_id) {
        this.sf_id = sf_id;
    }

    public String getSf_name() {
        return sf_name;
    }

    public void setSf_name(String sf_name) {
        this.sf_name = sf_name;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }
}
