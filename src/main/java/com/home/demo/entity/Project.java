package com.home.demo.entity;

public class Project {
    private Integer p_id;
    private String p_name;
    private String p_url;

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

    public String getP_url() {
        return p_url;
    }

    public void setP_url(String p_url) {
        this.p_url = p_url;
    }

    @Override
    public String toString() {
        return "Project{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", p_url='" + p_url + '\'' +
                '}';
    }
}
