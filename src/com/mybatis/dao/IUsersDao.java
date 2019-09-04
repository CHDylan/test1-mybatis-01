package com.mybatis.dao;

import com.mybatis.pojo.Studnet;

import java.util.List;

public interface IUsersDao {

    public   int   deleteUsersId(Integer  id) throws  Exception;


    public List<Studnet> selectStudetn()throws  Exception;


    public  int  updateselectStudetn(Studnet studnet)throws  Exception;


    public  int  addStudnet(Studnet studnet)throws  Exception;
}

