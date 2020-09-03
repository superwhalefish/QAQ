package com.ly.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Catevideo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String cate_video;
	private String cate_code;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCate_video() {
		return cate_video;
	}
	public void setCate_video(String cate_video) {
		this.cate_video = cate_video;
	}
	public String getCate_code() {
		return cate_code;
	}
	public void setCate_code(String cate_code) {
		this.cate_code = cate_code;
	}
	public Catevideo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Catevideo(Integer id, String cate_video, String cate_code) {
		super();
		this.id = id;
		this.cate_video = cate_video;
		this.cate_code = cate_code;
	}
	@Override
	public String toString() {
		return "Catevideo [id=" + id + ", cate_video=" + cate_video + ", cate_code=" + cate_code + "]";
	}
	
	
}
