package com.lby.mybatis.session.defaults;

import com.lby.mybatis.binding.MapperRegistry;
import com.lby.mybatis.session.Configuration;
import com.lby.mybatis.session.SqlSession;
import com.lby.mybatis.session.SqlSessionFactory;

/**
 * @author lby
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}
