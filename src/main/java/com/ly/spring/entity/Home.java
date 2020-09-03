package com.ly.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Home {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String h_title;
	private String h_content;
	private String h_time;
	private String h_author;
	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Home(Integer id, String h_title, String h_content, String h_time, String h_author) {
		super();
		this.id = id;
		this.h_title = h_title;
		this.h_content = h_content;
		this.h_time = h_time;
		this.h_author = h_author;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getH_title() {
		return h_title;
	}
	public void setH_title(String h_title) {
		this.h_title = h_title;
	}
	public String getH_content() {
		return h_content;
	}
	public void setH_content(String h_content) {
		this.h_content = h_content;
	}
	public String getH_time() {
		return h_time;
	}
	public void setH_time(String h_time) {
		this.h_time = h_time;
	}
	public String getH_author() {
		return h_author;
	}
	public void setH_author(String h_author) {
		this.h_author = h_author;
	}
	@Override
	public String toString() {
		return "Home [id=" + id + ", h_title=" + h_title + ", h_content=" + h_content + ", h_time=" + h_time
				+ ", h_author=" + h_author + "]";
	}
	
	
}
