package com.mybatis.dao;

import com.mybatis.pojo.UsersOrStudent;

import java.util.List;

public interface IUsersOrStudent {

    public List<UsersOrStudent>  selectUsersOrStudentList()throws  Exception;
}
