package com.lib.author.demo.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.author.demo.dto.AuthorDto;
import com.lib.author.demo.entity.AuthorEntity;
import com.lib.author.demo.reposistory.AuthorReposistory;
import com.lib.author.demo.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	AuthorReposistory authorReposistory;

	@Override
	public AuthorEntity saveAuthorDetials(AuthorDto authorDto) {

		AuthorEntity authorEntity = new AuthorEntity();
		authorEntity.setAuthormail(authorDto.getAuthormail());
		authorEntity.setAuthorMobile(authorDto.getAuthorMobile());
		LocalDateTime localDate = LocalDateTime.now();
		authorEntity.setAuthorName(authorDto.getAuthorName());
		authorEntity.setCreatedDate(localDate);
		authorReposistory.save(authorEntity);

		// TODO Auto-generated method stub
		return authorEntity;
	}

	@Override
	public List<AuthorEntity> gateAuthorDetails() {
		List<AuthorEntity> authorList = new ArrayList<AuthorEntity>();
		AuthorEntity authorEntity = new AuthorEntity();
		authorEntity.setAuthormail("author@gmail.com");
		authorEntity.setAuthorMobile("89892314234");
		LocalDateTime localDate = LocalDateTime.now();
		authorEntity.setAuthorName("james ghosling");
		authorEntity.setCreatedDate(localDate);
		authorEntity.setId(1);
		
		AuthorEntity authorEntity1 = new AuthorEntity();
		authorEntity1.setAuthormail("author@gmail.com");
		authorEntity1.setAuthorMobile("89892314234");
		LocalDateTime localDate1 = LocalDateTime.now();
		authorEntity1.setAuthorName("james ghosling");
		authorEntity1.setCreatedDate(localDate1);
		authorEntity1.setId(2);
		authorList.add(authorEntity1);
		authorList.add(authorEntity);
		
		return authorList;
	}

}
