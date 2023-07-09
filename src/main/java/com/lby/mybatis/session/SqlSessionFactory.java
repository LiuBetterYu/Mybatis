package com.lby.mybatis.session;

/**
 * @author lby
 */
public interface SqlSessionFactory {

    /**
     * 打开一个 session
     * @return Sqlsession
     */
    SqlSession openSession();
}
