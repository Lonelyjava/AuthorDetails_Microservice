package com.lib.author.demo.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lib.author.demo.entity.AuthorEntity;

@Repository
public interface AuthorReposistory extends JpaRepository<AuthorEntity, Long>{

}
