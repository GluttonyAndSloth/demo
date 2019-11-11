package com.home.demo.entity;

public class Price {
    private Integer pri_id;
    private String pri_name;
    private Integer pri_price;
    private String pri_danwei;
    private String pri_bei;
    private  String ids;

    @Override
    public String toString() {
        return "Price{" +
                "pri_id=" + pri_id +
                ", pri_name='" + pri_name + '\'' +
                ", pri_price=" + pri_price +
                ", pri_danwei='" + pri_danwei + '\'' +
                ", pri_bei='" + pri_bei + '\'' +
                ", ids='" + ids + '\'' +
                '}';
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
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

    public Integer getPri_price() {
        return pri_price;
    }

    public void setPri_price(Integer pri_price) {
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

}
