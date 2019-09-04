package com.mybatis.dao;

import com.mybatis.pojo.Person;
import com.mybatis.pojo.Studnet;

import java.util.List;

public interface IPersonDao {

    public   int   deletePersonId(Integer id) throws  Exception;


    public List<Studnet> selectPerson(Person person)throws  Exception;


    public  int  updateselectPerson(Person person)throws  Exception;


    public  int  addPerson(Person person)throws  Exception;
}

