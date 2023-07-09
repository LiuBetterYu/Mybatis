package com.lby.mybatis.session.defaults;

import com.lby.mybatis.binding.MapperRegistry;
import com.lby.mybatis.session.SqlSession;
import com.lby.mybatis.session.SqlSessionFactory;

/**
 * @author lby
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}
