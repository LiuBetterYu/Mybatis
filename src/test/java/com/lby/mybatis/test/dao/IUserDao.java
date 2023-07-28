package com.lby.mybatis.test.dao;

import com.lby.mybatis.test.po.User;

/**
 * @author lby
 */
public interface IUserDao {

    User queryUserInfoById(Long uId);

}
