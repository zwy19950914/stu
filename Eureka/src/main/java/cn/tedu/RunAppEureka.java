package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RunAppEureka {
	public static void main(String[] args) {
		SpringApplication.run(RunAppEureka.class, args);
	}
}
