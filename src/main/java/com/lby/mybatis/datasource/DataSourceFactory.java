package com.lby.mybatis.datasource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 数据源工厂
 * @author lby
 */
public interface DataSourceFactory {

    void setProperties(Properties props);

    DataSource getDataSource();
}
