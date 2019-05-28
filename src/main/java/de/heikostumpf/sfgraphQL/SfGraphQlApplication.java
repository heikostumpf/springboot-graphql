package de.heikostumpf.sfgraphQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;

import javax.servlet.Filter;

@SpringBootApplication
public class SfGraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfGraphQlApplication.class, args);
	}
}
