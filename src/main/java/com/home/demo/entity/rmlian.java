package com.home.demo.entity;

public class rmlian {
    private Integer tm_id;
    private Integer roleid;
    private Integer menuid;

    public rmlian(Integer tm_id, Integer roleid, Integer menuid) {
        this.tm_id = tm_id;
        this.roleid = roleid;
        this.menuid = menuid;
    }

    public Integer getTm_id() {
        return tm_id;
    }

    public void setTm_id(Integer tm_id) {
        this.tm_id = tm_id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    @Override
    public String toString() {
        return "rmlian{" +
                "tm_id=" + tm_id +
                ", roleid=" + roleid +
                ", menuid=" + menuid +
                '}';
    }

    public rmlian() {
        super();
    }
}
