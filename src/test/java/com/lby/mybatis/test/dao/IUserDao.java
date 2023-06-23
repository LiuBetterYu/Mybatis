package com.lby.mybatis.test.dao;

/**
 * @author lby
 */
public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);
}
