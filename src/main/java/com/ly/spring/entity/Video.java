package com.ly.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Component
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String v_title;
	private String v_content;
	private String v_author;
	private String v_time;
	private String v_code;
	private String v_url;
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Video(Integer id, String v_title, String v_content, String v_author, String v_time, String v_code,
			String v_url) {
		super();
		this.id = id;
		this.v_title = v_title;
		this.v_content = v_content;
		this.v_author = v_author;
		this.v_time = v_time;
		this.v_code = v_code;
		this.v_url = v_url;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getV_title() {
		return v_title;
	}
	public void setV_title(String v_title) {
		this.v_title = v_title;
	}
	public String getV_content() {
		return v_content;
	}
	public void setV_content(String v_content) {
		this.v_content = v_content;
	}
	public String getV_author() {
		return v_author;
	}
	public void setV_author(String v_author) {
		this.v_author = v_author;
	}
	public String getV_time() {
		return v_time;
	}
	public void setV_time(String v_time) {
		this.v_time = v_time;
	}
	public String getV_code() {
		return v_code;
	}
	public void setV_code(String v_code) {
		this.v_code = v_code;
	}
	public String getV_url() {
		return v_url;
	}
	public void setV_url(String v_url) {
		this.v_url = v_url;
	}
	@Override
	public String toString() {
		return "Video [id=" + id + ", v_title=" + v_title + ", v_content=" + v_content + ", v_author=" + v_author
				+ ", v_time=" + v_time + ", v_code=" + v_code + ", v_url=" + v_url + "]";
	}
	
}
