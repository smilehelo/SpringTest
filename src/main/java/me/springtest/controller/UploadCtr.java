package me.springtest.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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
	
	
	/**
	 * 上传多个文件的并保存
	 * @param upload
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/upload")
	public void upload(@RequestPart("upload")MultipartFile[] upload) throws IllegalStateException, IOException{
		System.out.println(upload.length);
		for(MultipartFile one : upload){
			//如果没有文件，不执行
			if(StringUtils.isEmpty(one.getOriginalFilename())){
				continue;
			}
			System.out.println(one.getOriginalFilename());
			System.out.println(one.getSize());
			one.transferTo(new File(System.currentTimeMillis()+one.getOriginalFilename()));
		}
	}
}
