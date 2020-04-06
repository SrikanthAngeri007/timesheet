package com.kp.org.timesheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {
        JpaRepositoriesAutoConfiguration.class
})
@EntityScan(basePackages = {"com.kp.org.timesheet.entity"})
@EnableJpaRepositories(basePackages = {"com.kp.org.timesheet.repository"})
@EnableJpaAuditing
public class TimesheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimesheetApplication.class, args);
	}

}
