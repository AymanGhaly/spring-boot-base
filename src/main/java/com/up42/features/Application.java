package com.up42.features;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories({"com.bonial.fulfilmentmanagement.repository"})
//@EntityScan(basePackages = {"com.bonial.hibernate", "com.bonial.fulfilmentmanagement"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);

    }


}
