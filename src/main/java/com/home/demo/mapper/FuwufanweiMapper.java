package com.home.demo.mapper;


import com.home.demo.entity.Fuwufanwei;
import com.home.demo.entity.Project;
import com.home.demo.entity.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface FuwufanweiMapper {
    //查询所有的方法
    //alt+ enter
    public List<Fuwufanwei> Selectpagefuwu(Map<String, Object> map);

    //查询条数
    public Integer selectAllFuwuCount(Map<String, Object> map);
    //修改
    public boolean updateFuwu(Fuwufanwei fuwufanwei);
    //添加
    public boolean addFuwu(String sf_name, Integer p_id);
    public Integer selectProject(String p_name);
    public boolean delete(Fuwufanwei fuwufanwei);
    //查询所有服务名称
    public List<Project> selectPro();
    List<user> finduser(String u_name);
public boolean updateuser(user user);
}
