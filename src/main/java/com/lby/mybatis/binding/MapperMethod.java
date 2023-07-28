package com.lby.mybatis.binding;

import com.lby.mybatis.mapping.MappedStatement;
import com.lby.mybatis.mapping.SqlCommandType;
import com.lby.mybatis.session.Configuration;
import com.lby.mybatis.session.SqlSession;

import java.lang.reflect.Method;

/**
 *  映射器方法
 * @author lby
 */
public class MapperMethod {

    private final SqlCommand command;

    public MapperMethod(Configuration configuration, Class<?> mapperInterface, Method method) {
        this.command = new SqlCommand(configuration, mapperInterface, method);
    }

    public Object execute(SqlSession sqlSession, Object args[]) {
        Object result = null;
        switch (command.getType()) {
            case INSERT:
                break;
            case DELETE:
                break;
            case UPDATE:
                break;
            case SELECT:
                result = sqlSession.selectOne(command.getName(), args);
                break;
            default:
                throw new RuntimeException("Unknown execution method for: " + command.getName());
        }
        return result;
    }
    /**
     * sql指令
     */
    public static class SqlCommand {
        private final String name;
        private final SqlCommandType type;

        public SqlCommand(Configuration configuration, Class<?> mapperInterface, Method method) {
            String statementName = mapperInterface.getName() + "." + method.getName();
            MappedStatement ms = configuration.getMappedStatement(statementName);
            name = ms.getId();
            type = ms.getSqlCommandType();
        }
        public String getName() {
            return name;
        }

        public SqlCommandType getType() {
            return type;
        }
    }
}
