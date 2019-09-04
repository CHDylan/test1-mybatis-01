package com.mybatis.dao;

import com.mybatis.pojo.Studnet;

import java.util.List;

public interface IStudentSql {

    public List<Studnet> selectStudentSqlFor(Studnet  studnet)throws  Exception;


    public List<Studnet> selectStudentSqlIf(Studnet  studnet)throws  Exception;
}
