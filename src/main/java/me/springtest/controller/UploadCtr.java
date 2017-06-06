package me.springtest.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class UploadCtr {

	@RequestMapping("/test")
	public void test(){
		System.out.println("Test");
	}
	
	
	@RequestMapping("/upload")
	public void upload(@RequestPart("upload")MultipartFile[] upload) throws IllegalStateException, IOException{
		System.out.println(upload.length);
		for(MultipartFile one : upload){
			System.out.println(one.getOriginalFilename());
			System.out.println(one.getSize());
			one.transferTo(new File(System.currentTimeMillis()+one.getOriginalFilename()));
		}
		

	}
}
