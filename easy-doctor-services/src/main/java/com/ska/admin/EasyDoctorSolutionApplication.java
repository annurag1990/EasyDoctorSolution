package com.ska.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan(basePackages = {"com.ska.admin.entity"})
@EnableJpaRepositories(basePackages = {"com.ska.admin.repository"})
@SpringBootApplication(scanBasePackages = {"com.ska.admin.rest","com.ska.admin.service"})
@EnableAspectJAutoProxy
public class EasyDoctorSolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyDoctorSolutionApplication.class, args);
	}
}
