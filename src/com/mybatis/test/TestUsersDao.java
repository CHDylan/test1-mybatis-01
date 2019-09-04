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


public class TestUsersDao {

    @Test
    public   void   updateUsers() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IUsersDao usersDao = sqlSession.getMapper(IUsersDao.class);
        Studnet studnet = new Studnet();
        studnet.setName("隔壁老陈");
        studnet.setMonery(345F);
        studnet.setId(10);
        int i = usersDao.updateselectStudetn(studnet);
        System.out.println(i);

        sqlSession.commit();
    }
    @Test
    public   void   addUsers() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IUsersDao usersDao = sqlSession.getMapper(IUsersDao.class);
        Studnet studnet = new Studnet();
        studnet.setName("老王");
        studnet.setMonery(1231F);
        int i = usersDao.addStudnet(studnet);
        System.out.println(i);

        sqlSession.commit();
    }
    @Test
    public   void   SelUsers() throws  Exception{
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


    @Test
    public   void testSelUsersDel() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IUsersDao usersDao = sqlSession.getMapper(IUsersDao.class);
        int i = usersDao.deleteUsersId(3);
        System.out.println(i);

        sqlSession.commit();
    }




}
