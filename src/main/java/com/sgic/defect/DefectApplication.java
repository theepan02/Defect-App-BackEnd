package com.sgic.defect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"com.sgic.entity"} )
public class DefectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefectApplication.class, args);
	}

}
