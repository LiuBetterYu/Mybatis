package com.lby.mybatis.mapping;

/**
 * SQL指令类型
 * @author lby
 */
public enum SqlCommandType {

    /**
     * 未知
     */
    UNKNOWN,
    /**
     * 插入
     */
    INSERT,
    /**
     * 更新
     */
    UPDATE,
    /**
     * 查找
     */
    SELECT,
    /**
     * 删除
     */
    DELETE;
}
