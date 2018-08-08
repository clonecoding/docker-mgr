package com.jdddata.dockermgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
public class DockerMgrApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerMgrApplication.class, args);
    }
}
