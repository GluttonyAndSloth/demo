package com.home.demo.util;

import java.util.ArrayList;
import java.util.List;

public class PageUtil<T> {
private int code=0;
private String msg;
private int count;
private List<T> data=new ArrayList();
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public int getCount() {
	return count;
}
public void setCount(int s) {
	this.count = s;
}
public List<T> getData() {
	return data;
}
public void setData(List<T> data) {
	this.data = data;
}

}
