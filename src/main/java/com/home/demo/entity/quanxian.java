package com.home.demo.entity;

public class quanxian {
    private Integer id;
    private String name;
    private String url;
    private Integer pid;

    public quanxian(Integer id, String name, String url, Integer pid) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.pid = pid;
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

    @Override
    public String toString() {
        return "quanxian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", pid=" + pid +
                '}';
    }

    public quanxian() {
        super();
    }
}
