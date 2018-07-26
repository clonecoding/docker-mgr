package com.jdddata.dockermgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DockerMgrApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerMgrApplication.class, args);
	}
}
