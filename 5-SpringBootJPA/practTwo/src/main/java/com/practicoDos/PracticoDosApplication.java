package com.practicoDos;

import com.practicoDos.models.service.IUploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticoDosApplication implements CommandLineRunner {

	@Autowired
	IUploadFileService uploadFileService;
	public static void main(String[] args) {
		SpringApplication.run(PracticoDosApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		uploadFileService.deleteAll();
		uploadFileService.init();
	}
}
