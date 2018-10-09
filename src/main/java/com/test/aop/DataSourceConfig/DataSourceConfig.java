package com.test.aop.DataSourceConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {

    @Bean(name = "slave")
    @ConfigurationProperties(prefix = "spring.datasource.slave")
    public DataSource slaveDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "master")
    @ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource masterDataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * 动态数据源：通过AOP在不同数据源之间切换
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource(){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //默认数据源
        dynamicDataSource.setDefaultTargetDataSource(masterDataSource());
        //配置多数据源
        Map<Object,Object> dsMap = new HashMap<Object, Object>();
        dsMap.put("slave",slaveDataSource());
        dsMap.put("master",masterDataSource());
        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }
}
