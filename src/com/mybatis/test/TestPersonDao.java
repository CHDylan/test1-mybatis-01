package com.mybatis.test;

import com.mybatis.dao.IPersonDao;
import com.mybatis.dao.IUsersDao;
import com.mybatis.pojo.Person;
import com.mybatis.pojo.Studnet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class TestPersonDao {
    @Test
    public   void testSelUsersADD() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IPersonDao ipersondao = sqlSession.getMapper(IPersonDao.class);
        Person person = new Person();
        Studnet studnet = new Studnet();
        studnet.setId(10);
        studnet.setName("老王");
        studnet.setMonery(123f);
        person.setStudnet(studnet);

        int i = ipersondao.addPerson(person);

        System.out.println(i);
        sqlSession.commit();
    }



    @Test
    public   void testSelUsersDel() throws  Exception{
        //加载核心配置文件
        InputStream asStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(asStream);
        SqlSession sqlSession = sessionFactory.openSession();
        IPersonDao ipersondao = sqlSession.getMapper(IPersonDao.class);
        Person person = new Person();
        Studnet studnet = new Studnet();
        studnet.setId(10);

        person.setStudnet(studnet);
        List<Studnet> studnets = ipersondao.selectPerson(person);
        System.out.println(studnets);
        sqlSession.commit();
    }




}
