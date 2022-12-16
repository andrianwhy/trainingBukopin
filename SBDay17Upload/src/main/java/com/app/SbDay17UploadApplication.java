package com.app;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbDay17UploadApplication {

	public static String uploadingDir = System.getProperty("user.dir") + "/uploadingDir/";
	
	public static void main(String[] args) {
		SpringApplication.run(SbDay17UploadApplication.class, args);
		
		//create directory
		new File(uploadingDir).mkdir();
		
		//get project path
//		String pathProj = System.getProperty("user.dir");
//		System.out.println(pathProj);
	}

}
