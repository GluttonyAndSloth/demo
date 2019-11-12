package com.home.demo.entity;

import java.util.Date;

public class baojszd {
    private Integer y_id;
    private String y_name;
    private Integer y_age;
    private String y_sex;
    private Integer y_sydl;
    private Integer y_yfgz;
    private Integer y_sfgz;
    private Integer y_hps;
    private Integer y_cps;
    private Date y_czsj;
    private Integer c_id;

    public baojszd(Integer y_id, String y_name, Integer y_age, String y_sex, Integer y_sydl, Integer y_yfgz, Integer y_sfgz, Integer y_hps, Integer y_cps, Date y_czsj, Integer c_id) {
        this.y_id = y_id;
        this.y_name = y_name;
        this.y_age = y_age;
        this.y_sex = y_sex;
        this.y_sydl = y_sydl;
        this.y_yfgz = y_yfgz;
        this.y_sfgz = y_sfgz;
        this.y_hps = y_hps;
        this.y_cps = y_cps;
        this.y_czsj = y_czsj;
        this.c_id = c_id;
    }

    public Integer getY_id() {
        return y_id;
    }

    public void setY_id(Integer y_id) {
        this.y_id = y_id;
    }

    public String getY_name() {
        return y_name;
    }

    public void setY_name(String y_name) {
        this.y_name = y_name;
    }

    public Integer getY_age() {
        return y_age;
    }

    public void setY_age(Integer y_age) {
        this.y_age = y_age;
    }

    public String getY_sex() {
        return y_sex;
    }

    public void setY_sex(String y_sex) {
        this.y_sex = y_sex;
    }

    public Integer getY_sydl() {
        return y_sydl;
    }

    public void setY_sydl(Integer y_sydl) {
        this.y_sydl = y_sydl;
    }

    public Integer getY_yfgz() {
        return y_yfgz;
    }

    public void setY_yfgz(Integer y_yfgz) {
        this.y_yfgz = y_yfgz;
    }

    public Integer getY_sfgz() {
        return y_sfgz;
    }

    public void setY_sfgz(Integer y_sfgz) {
        this.y_sfgz = y_sfgz;
    }

    public Integer getY_hps() {
        return y_hps;
    }

    public void setY_hps(Integer y_hps) {
        this.y_hps = y_hps;
    }

    public Integer getY_cps() {
        return y_cps;
    }

    public void setY_cps(Integer y_cps) {
        this.y_cps = y_cps;
    }

    public Date getY_czsj() {
        return y_czsj;
    }

    public void setY_czsj(Date y_czsj) {
        this.y_czsj = y_czsj;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    @Override
    public String toString() {
        return "bjszd{" +
                "y_id=" + y_id +
                ", y_name='" + y_name + '\'' +
                ", y_age=" + y_age +
                ", y_sex='" + y_sex + '\'' +
                ", y_sydl=" + y_sydl +
                ", y_yfgz=" + y_yfgz +
                ", y_sfgz=" + y_sfgz +
                ", y_hps=" + y_hps +
                ", y_cps=" + y_cps +
                ", y_czsj=" + y_czsj +
                ", c_id=" + c_id +
                '}';
    }

    public baojszd() {
        super();
    }
}
