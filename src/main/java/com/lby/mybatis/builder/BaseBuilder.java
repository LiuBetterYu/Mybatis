package com.lby.mybatis.builder;

import com.lby.mybatis.session.Configuration;
import com.lby.mybatis.type.TypeAliasRegistry;

/**
 * @author lby
 */
public abstract class BaseBuilder {

    protected final Configuration configuration;

    protected final TypeAliasRegistry typeAliasRegistry;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
        this.typeAliasRegistry = this.configuration.getTypeAliasRegistry();
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
