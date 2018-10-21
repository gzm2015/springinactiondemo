package com.lmk;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author LiuMengKe
 * @create 2018-07-16-13:22
 */
@Configuration
@EnableMongoRepositories("com.lmk.db")
public class MongoDbConfig {


    @Bean
    public MongoClientFactoryBean mongo(){

        MongoClientFactoryBean bean = new MongoClientFactoryBean();
        return bean;
    }

    @Bean
    public MongoOperations mongotemplate(Mongo mongo){
        return new MongoTemplate(mongo,"ordersdb");
    }


}
