package com.mybatis.test;

import com.mybatis.dao.IStudentArryOrMapOrList;
import com.mybatis.dao.IUsersOrStudent;
import com.mybatis.pojo.Studnet;
import com.mybatis.pojo.UsersOrStudent;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestIStudentArryOrMapOrList {
    @Test
    public   void testSelUsersMap() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IStudentArryOrMapOrList iStudentArryOrMapOrList = sqlSession.getMapper(IStudentArryOrMapOrList.class);

        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("nameKey","name");
        stringObjectHashMap.put("nameValeus","老王");


        List<Studnet> studnets = iStudentArryOrMapOrList.selectMap(stringObjectHashMap);

        System.out.println(studnets);

        sqlSession.commit();
    }

    @Test
    public   void testSelUsersList() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IStudentArryOrMapOrList iStudentArryOrMapOrList = sqlSession.getMapper(IStudentArryOrMapOrList.class);


        ArrayList<Object> objects = new ArrayList<>();
        objects.add("隔壁老陈");
        objects.add(345);

        List<Studnet> studnets = iStudentArryOrMapOrList.selectList(objects);

        System.out.println(studnets);

        sqlSession.commit();
}
    @Test
    public   void testSelUsersDel() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IStudentArryOrMapOrList iStudentArryOrMapOrList = sqlSession.getMapper(IStudentArryOrMapOrList.class);

        Object[]  obj= new Object[]{5};

        List<Studnet> studnets = iStudentArryOrMapOrList.selectArray(obj);

        System.out.println(studnets);

        sqlSession.commit();
    }
}
