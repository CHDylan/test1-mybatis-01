package com.mybatis.dao;

import com.mybatis.pojo.Studnet;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IStudentDao {


    @Delete("")
    public   int   deleteStudentId(Integer  id) throws  Exception;

    @Select("select * from Studnet where name = #{name} and monery=#{monery} ")
    @Results({@Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "monery",column = "monery")})
    public List<Studnet> selectStudent(Studnet studnet)throws  Exception;

    @Update("")
    public  int  updateselectStudent(Studnet studnet)throws  Exception;

        @Insert("")
    public  int  addStudent(Studnet studnet)throws  Exception;

}
