package com.mybatis.dao;

import com.mybatis.pojo.Studnet;

import java.util.List;
import java.util.Map;

public interface IStudentArryOrMapOrList {

    public List<Studnet>  selectArray(Object []  array)throws  Exception;
    public List<Studnet>  selectList(List<Object>  list)throws  Exception;
    public List<Studnet>  selectMap(Map<String,Object> map)throws  Exception;
}
