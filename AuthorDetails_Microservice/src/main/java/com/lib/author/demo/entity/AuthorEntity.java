package com.lib.author.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lib_Author")
public class AuthorEntity {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String authorName;
	private String authorMobile;
	private String authormail;
	private LocalDateTime createdDate;
	

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorMobile() {
		return authorMobile;
	}

	public void setAuthorMobile(String authorMobile) {
		this.authorMobile = authorMobile;
	}

	public String getAuthormail() {
		return authormail;
	}

	public void setAuthormail(String authormail) {
		this.authormail = authormail;
	}

}
