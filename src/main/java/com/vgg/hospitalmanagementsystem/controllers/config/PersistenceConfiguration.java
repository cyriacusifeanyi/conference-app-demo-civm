//package com.vgg.hospitalmanagementsystem.controllers.config;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//
////        we can overwrite settings in application.properties or application.yml here.
////        It gave some error, so I added the below lines of code
//        builder.username("postgres");
//        builder.password("zx12cv36");
//
//        System.out.println("My custom datasource bean has been initialized and set");
//        return builder.build();
//    }
//}
