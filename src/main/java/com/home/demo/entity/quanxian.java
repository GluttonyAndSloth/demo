package com.home.demo.entity;

public class quanxian {
    private Integer id;
    private String name;
    private String url;
    private Integer pid;
    private String icon;

    public quanxian(Integer id, String name, String url, Integer pid, String icon) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.pid = pid;
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "quanxian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", pid=" + pid +
                ", icon='" + icon + '\'' +
                '}';
    }

    public quanxian() {
        super();
    }
}
