package com.lib.author.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lib.author.demo.dto.AuthorDto;
import com.lib.author.demo.entity.AuthorEntity;
import com.lib.author.demo.response.ApiResponse;
import com.lib.author.demo.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	AuthorService authorService;

	@PostMapping("/saveAuthor")
	public ResponseEntity<?> saveAuthorDetials(@RequestBody AuthorDto authorDto) {

		ApiResponse apiRes = new ApiResponse();
		AuthorEntity authorntity = authorService.saveAuthorDetials(authorDto);
		apiRes.setResponseMessage("saved successfully");
		apiRes.setResponseCode(200);
		apiRes.setResponseError(false);
		apiRes.setData(authorntity);

		return new ResponseEntity<>(apiRes,HttpStatus.OK);
	}
	
	@GetMapping("/getAuthor")
	public ResponseEntity<?> getUserDetails(){
		
		ApiResponse apiRes = new ApiResponse();
		
		List<AuthorEntity> authorntity=authorService.gateAuthorDetails();
		
//		apiRes.setResponseMessage("saved successfully");
//		apiRes.setResponseCode(200);
//		apiRes.setResponseError(false);
//		apiRes.setData(authorntity);
		
		return new ResponseEntity<>(authorntity,HttpStatus.OK);
	}

}
