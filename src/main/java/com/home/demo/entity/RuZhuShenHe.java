package com.home.demo.entity;

public class RuZhuShenHe {
    private int r_id;
    private String r_biaoti;
    private String r_liucheng;
    private String r_xiangmu;
    private int r_price;
    private String r_jijia;
    private String r_beizhu;

    @Override
    public String toString() {
        return "RuZhuShenHe{" +
                "r_id=" + r_id +
                ", r_biaoti='" + r_biaoti + '\'' +
                ", r_liucheng='" + r_liucheng + '\'' +
                ", r_xiangmu='" + r_xiangmu + '\'' +
                ", r_price=" + r_price +
                ", r_jijia='" + r_jijia + '\'' +
                ", r_beizhu='" + r_beizhu + '\'' +
                ", id=" + id +
                ", r_shenhe='" + r_shenhe + '\'' +
                ", s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_number='" + s_number + '\'' +
                ", b_id=" + b_id +
                ", b_liyou='" + b_liyou + '\'' +
                '}';
    }

    private int id;
    private String r_shenhe;
    private int s_id;
    private String s_name;
    private String s_number;
    private int b_id;
    private String b_liyou;

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_liyou() {
        return b_liyou;
    }

    public void setB_liyou(String b_liyou) {
        this.b_liyou = b_liyou;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_biaoti() {
        return r_biaoti;
    }

    public void setR_biaoti(String r_biaoti) {
        this.r_biaoti = r_biaoti;
    }

    public String getR_liucheng() {
        return r_liucheng;
    }

    public void setR_liucheng(String r_liucheng) {
        this.r_liucheng = r_liucheng;
    }

    public String getR_xiangmu() {
        return r_xiangmu;
    }

    public void setR_xiangmu(String r_xiangmu) {
        this.r_xiangmu = r_xiangmu;
    }

    public int getR_price() {
        return r_price;
    }

    public void setR_price(int r_price) {
        this.r_price = r_price;
    }

    public String getR_jijia() {
        return r_jijia;
    }

    public void setR_jijia(String r_jijia) {
        this.r_jijia = r_jijia;
    }

    public String getR_beizhu() {
        return r_beizhu;
    }

    public void setR_beizhu(String r_beizhu) {
        this.r_beizhu = r_beizhu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getR_shenhe() {
        return r_shenhe;
    }

    public void setR_shenhe(String r_shenhe) {
        this.r_shenhe = r_shenhe;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_number() {
        return s_number;
    }

    public void setS_number(String s_number) {
        this.s_number = s_number;
    }
}
