package com.home.demo.entity;

public class urlian {
    private Integer tr_id;
    private Integer roleid;
    private Integer userid;

    public urlian(Integer tr_id, Integer roleid, Integer userid) {
        this.tr_id = tr_id;
        this.roleid = roleid;
        this.userid = userid;
    }

    public Integer getTr_id() {
        return tr_id;
    }

    public void setTr_id(Integer tr_id) {
        this.tr_id = tr_id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "urlian{" +
                "tr_id=" + tr_id +
                ", roleid=" + roleid +
                ", userid=" + userid +
                '}';
    }

    public urlian() {
        super();
    }
}
