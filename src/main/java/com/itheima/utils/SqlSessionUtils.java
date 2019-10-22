package com.itheima.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {


    private static   SqlSession sqlSession;

    static {

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

            sqlSession = sqlSessionFactory.openSession(true);

        } catch (IOException e) {

            e.printStackTrace();

        }


    }


    public static SqlSession getSqlSession(){

        return sqlSession;
    }


}
