package com.app.restController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.SbDay17UploadApplication;

@RestController
@RequestMapping("api/file1/")
public class FileToFolderCtrl {

	public static String uploadDir = SbDay17UploadApplication.uploadingDir;

	@PostMapping("upload1")
	public void upload1(@RequestParam("uploadFiles") MultipartFile[] uploadFiles) {
		System.out.println(uploadFiles);

		try {
			for (MultipartFile multipartFile : uploadFiles) {
				File file = new File(uploadDir + multipartFile.getOriginalFilename());
				multipartFile.transferTo(file);
			}
		} catch (IllegalStateException | IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@DeleteMapping("delete/{filename}")
	public ResponseEntity<Object> delFile(@PathVariable("filename") String fn) {
		//delete
		File file = new File(uploadDir + fn);		
		System.out.println();
		if (file.exists()) {
			file.delete();
			return ResponseEntity.status(HttpStatus.OK).body(fn+", deleted");	
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(fn+", tidak ada");
		}
		
	}
	
	@GetMapping("download/{filename}")
	public ResponseEntity<byte[]> download(@PathVariable("filename")String fn) {
		byte[] image = new byte[0];
		//get File
		Path path = Paths.get(uploadDir+fn);
		System.out.println(path);
		//baca sebagai byte dari file
		try {
			image = Files.readAllBytes(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.IMAGE_PNG).body(image);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
