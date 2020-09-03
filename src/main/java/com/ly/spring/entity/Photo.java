package com.ly.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Photo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String p_title;
	private String p_content;
	private String p_author;
	private String p_uptime;
	private String p_code;
	private String p_url;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public String getP_content() {
		return p_content;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
	}
	public String getP_author() {
		return p_author;
	}
	public void setP_author(String p_author) {
		this.p_author = p_author;
	}
	public String getP_uptime() {
		return p_uptime;
	}
	public void setP_uptime(String p_uptime) {
		this.p_uptime = p_uptime;
	}
	public String getP_code() {
		return p_code;
	}
	public void setP_code(String p_code) {
		this.p_code = p_code;
	}
	public String getP_url() {
		return p_url;
	}
	public void setP_url(String p_url) {
		this.p_url = p_url;
	}
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Photo(Integer id, String p_title, String p_content, String p_author, String p_uptime, String p_code,
			String p_url) {
		super();
		this.id = id;
		this.p_title = p_title;
		this.p_content = p_content;
		this.p_author = p_author;
		this.p_uptime = p_uptime;
		this.p_code = p_code;
		this.p_url = p_url;
	}
	@Override
	public String toString() {
		return "Photo [id=" + id + ", p_title=" + p_title + ", p_content=" + p_content + ", p_author=" + p_author
				+ ", p_uptime=" + p_uptime + ", p_code=" + p_code + ", p_url=" + p_url + "]";
	}
	
	
}
