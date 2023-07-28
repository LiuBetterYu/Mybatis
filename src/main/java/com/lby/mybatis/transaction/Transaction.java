package com.lby.mybatis.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 事务接口
 * @author lby
 */
public interface Transaction {

    Connection getConnection() throws SQLException;

    void commit() throws SQLException;

    void rollback() throws SQLException;

    void close() throws SQLException;
}
