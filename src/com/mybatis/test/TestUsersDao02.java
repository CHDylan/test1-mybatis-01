package com.mybatis.test;

import com.mybatis.dao.IUsersDao;
import com.mybatis.pojo.Studnet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class TestUsersDao02 {


    @Test
    public   void testSelUsersDel() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IUsersDao usersDao = sqlSession.getMapper(IUsersDao.class);

        List<Studnet> studnets = usersDao.selectStudetn();

        System.out.println(studnets);

        sqlSession.commit();
    }




}
