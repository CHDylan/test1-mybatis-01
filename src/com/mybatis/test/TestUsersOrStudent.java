package com.mybatis.test;

import com.mybatis.dao.IUsersDao;
import com.mybatis.dao.IUsersOrStudent;
import com.mybatis.pojo.Studnet;
import com.mybatis.pojo.UsersOrStudent;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestUsersOrStudent {

    /**
     *
     */
    @Test
    public   void testSelUsersDel() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IUsersOrStudent iusersOrStudent = sqlSession.getMapper(IUsersOrStudent.class);

        List<UsersOrStudent> usersOrStudents = iusersOrStudent.selectUsersOrStudentList();

        System.out.println(usersOrStudents);

        sqlSession.commit();
    }
}
