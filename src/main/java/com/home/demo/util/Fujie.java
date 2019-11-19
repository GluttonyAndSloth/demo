package com.home.demo.util;

import java.util.List;

public class Fujie {
    private String title;
    private Integer id;
    private List<Zijie> children;

    public Fujie(String title, Integer id, List<Zijie> children) {
        this.title = title;
        this.id = id;
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

    public List<Zijie> getChildren() {
        return children;
    }

    public void setChildren(List<Zijie> children) {
        this.children = children;
    }

    public Fujie() {
        super();
    }

    @Override
    public String toString() {
        return "Fujie{" +
                "title='" + title + '\'' +
                ", value='" + id + '\'' +
                ", data=" + children +
                '}';
    }
}
