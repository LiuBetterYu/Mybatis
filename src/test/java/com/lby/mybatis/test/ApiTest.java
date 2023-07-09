package com.lby.mybatis.test;

import com.lby.mybatis.binding.MapperProxyFactory;
import com.lby.mybatis.binding.MapperRegistry;
import com.lby.mybatis.session.SqlSession;
import com.lby.mybatis.session.SqlSessionFactory;
import com.lby.mybatis.session.defaults.DefaultSqlSessionFactory;
import com.lby.mybatis.test.dao.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lby
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_MapperProxyFactory() {
       // 注册Mapper
        MapperRegistry registry = new MapperRegistry();
        registry.addMappers("com.lby.mybatis.test.dao");

        // 从SqlSession工厂获取Session
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(registry);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 测试验证
        String res = userDao.queryUserName("10001");
        logger.info("测试结果：{}", res);
    }


    @Test
    public void test_proxy_class() {
        IUserDao userDao = (IUserDao) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{IUserDao.class}, (proxy, method, args) -> "你被代理了");
        String result = userDao.queryUserName("10001");
        System.out.println("测试结果：" + result);
    }
}
