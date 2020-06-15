package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ProjectApplication.class, args);

		StatusRepository statusRepository = run.getBean(StatusRepository.class);

		Status byStatusId = statusRepository.getByStatusId(3);

		System.out.println(byStatusId);

		List<Status> allByStatusIdGreaterThan = statusRepository.getAllByStatusIdGreaterThan(2);

		System.out.println(allByStatusIdGreaterThan);

		List<Status> bl = statusRepository.getAllByStatusNameLikeAndStatusIdGreaterThanEqual("cl%", 4);



		System.out.println(bl);

		Status sss = statusRepository.findUserByStatusNative(4);

		System.out.println(sss);

	}

}
