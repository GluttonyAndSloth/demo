package com.home.demo.entity;

public class ShouYe {
    private int u_id;
    private int c_id;
    private int o_id;
    private int p_id;

    @Override
    public String toString() {
        return "ShouYe{" +
                "u_id=" + u_id +
                ", c_id=" + c_id +
                ", o_id=" + o_id +
                ", p_id=" + p_id +
                '}';
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
}
