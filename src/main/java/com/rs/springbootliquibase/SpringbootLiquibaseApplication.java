package com.rs.springbootliquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.rs.springbootliquibase.model")
public class SpringbootLiquibaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLiquibaseApplication.class, args);
    }
}
