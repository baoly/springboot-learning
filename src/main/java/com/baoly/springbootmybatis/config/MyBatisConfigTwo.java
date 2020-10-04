package com.baoly.springbootmybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author baoly
 * @version 1.0
 * @date 2020/10/2 21:54
 * @description
 */
@Configuration
@MapperScan(basePackages = "com.baoly.springbootmybatis.mapper2", sqlSessionTemplateRef = "sqlSessionTemplate2", sqlSessionFactoryRef = "sqlSessionFactory2")
public class MyBatisConfigTwo {
    @Resource(name = "dsTwo")
    private DataSource dsTwo;


    @Bean
    SqlSessionFactory sqlSessionFactory2() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dsTwo);
        try {
            sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate2() {
        return new SqlSessionTemplate(sqlSessionFactory2());
    }
}
