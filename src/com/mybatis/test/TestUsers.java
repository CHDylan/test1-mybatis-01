package com.mybatis.test;

import com.mybatis.pojo.Studnet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.*;
import java.util.List;


public class TestUsers {


    /**
     *
     */
    @Test
    public   void test(){
    }









    @Test
    public   void testSelUsersDel() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        //创建Seesion
        SqlSession session = sessionFactory.openSession();
        //执行sql语句

        /// List<Studnet> oneList = session.selectList("com.inserStudent", );
        Studnet studnet = new Studnet();
        studnet.setMonery(2200F);
        studnet.setName("隔壁老陈");
        int insert = session.delete("com.deleteStudent", studnet);
        session.commit();

        System.out.println(insert);


    }





    @Test
    public   void testSelUsersUpdate() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        //创建Seesion
        SqlSession session = sessionFactory.openSession();
        //执行sql语句

        /// List<Studnet> oneList = session.selectList("com.inserStudent", );
        Studnet studnet = new Studnet();
        studnet.setMonery(2200F);
        studnet.setName("隔壁老陈");
        studnet.setId(4);
        int insert = session.update("com.updateStudent", studnet);
        session.commit();

        System.out.println(insert);


    }



    @Test
    public   void testSelUsersAdd() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        //创建Seesion
        SqlSession session = sessionFactory.openSession();
        //执行sql语句

       /// List<Studnet> oneList = session.selectList("com.inserStudent", );
        Studnet studnet = new Studnet();
        studnet.setMonery(1100F);
        studnet.setName("小王");
        int insert = session.insert("com.inserStudent", studnet);
        session.commit();

        System.out.println(insert);


    }





    @Test
    public   void testSelUserslike() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        //创建Seesion
        SqlSession session = sessionFactory.openSession();
        //执行sql语句

         List<Studnet> oneList = session.selectList("com.selectLike", "小");

        System.out.println(oneList);


    }

    /**
     * 入门查询测试
     */
    @Test
    public   void testSelUsers() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
      //创建Seesion
        SqlSession session = sessionFactory.openSession();
        //执行sql语句

        Studnet one = session.selectOne("com.selectUsers", 2);

        System.out.println(one);


    }

}
