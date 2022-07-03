package com.lib.author.demo.service;

import java.util.List;

import com.lib.author.demo.dto.AuthorDto;
import com.lib.author.demo.entity.AuthorEntity;

public interface AuthorService {
	
	
	public AuthorEntity saveAuthorDetials(AuthorDto authorDto);

	public List<AuthorEntity> gateAuthorDetails();
}
