package com.ly.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Component
public class Synopsis {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String s_title;
	private String s_content;
	private String s_author;
	private String s_uptime;
	private String s_code;
	public Synopsis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Synopsis(Integer id, String s_title, String s_content, String s_author, String s_uptime, String s_code) {
		super();
		this.id = id;
		this.s_title = s_title;
		this.s_content = s_content;
		this.s_author = s_author;
		this.s_uptime = s_uptime;
		this.s_code = s_code;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getS_title() {
		return s_title;
	}
	public void setS_title(String s_title) {
		this.s_title = s_title;
	}
	public String getS_content() {
		return s_content;
	}
	public void setS_content(String s_content) {
		this.s_content = s_content;
	}
	public String getS_author() {
		return s_author;
	}
	public void setS_author(String s_author) {
		this.s_author = s_author;
	}
	public String getS_uptime() {
		return s_uptime;
	}
	public void setS_uptime(String s_uptime) {
		this.s_uptime = s_uptime;
	}
	public String getS_code() {
		return s_code;
	}
	public void setS_code(String s_code) {
		this.s_code = s_code;
	}
	@Override
	public String toString() {
		return "Synopsis [id=" + id + ", s_title=" + s_title + ", s_content=" + s_content + ", s_author=" + s_author
				+ ", s_uptime=" + s_uptime + ", s_code=" + s_code + "]";
	}
	
	
}
