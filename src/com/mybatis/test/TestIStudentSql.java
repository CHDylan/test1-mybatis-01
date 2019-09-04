package com.mybatis.test;

import com.mybatis.dao.IStudentDao;
import com.mybatis.dao.IStudentSql;
import com.mybatis.pojo.Studnet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestIStudentSql {












    @Test
    public   void testSelUsersFOR() throws  Exception{


        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IStudentSql istudentsql = sqlSession.getMapper(IStudentSql.class);
        Studnet studnet = new Studnet();
        //    studnet.setName("隔壁老陈");
        // studnet.setMonery(345f);
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(8);
        objects.add(9);
        objects.add(10);
        objects.add(11);

        studnet.setArryaylist(objects);
        List<Studnet> studnets = istudentsql.selectStudentSqlFor(studnet);
        System.out.println(studnets);
        sqlSession.commit();
    }
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
        IStudentSql istudentsql = sqlSession.getMapper(IStudentSql.class);
                Studnet studnet = new Studnet();
            //    studnet.setName("隔壁老陈");
               // studnet.setMonery(345f);

        List<Studnet> studnets = istudentsql.selectStudentSqlIf(studnet);
        System.out.println(studnets);
        sqlSession.commit();
    }
}
