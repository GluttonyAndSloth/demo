package com.home.demo.util;

import java.util.List;

public class Zijie {
    private String title;
    private Integer id;
    private Boolean checked;
    private List children;

    public Zijie(String title, Integer id, Boolean checked, List children) {
        this.title = title;
        this.id = id;
        this.checked = checked;
        this.children = children;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Zijie{" +
                "title='" + title + '\'' +
                ", value='" + id + '\'' +
                ", checked=" + checked +
                ", data=" + children +
                '}';
    }

    public Zijie() {
        super();
    }
}
