package com.rhiodamuthie.eyemusicstudio.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//
//@Configuration
//@ConfigurationProperties(prefix = "spring.datasource.hikari")
//public class CustomHikariConfig extends HikariConfig {
//
//    @Bean
//    public DataSource dataSource() {
//        return new HikariDataSource(this);
//    }
//
//}