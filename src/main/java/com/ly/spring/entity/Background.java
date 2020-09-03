package com.ly.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Background {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String b_name;
	private String b_code;
	private String b_time;
	private String b_state;
	private String b_url;
	public Background() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Background(Integer id, String b_name, String b_code, String b_time, String b_state, String b_url) {
		super();
		this.id = id;
		this.b_name = b_name;
		this.b_code = b_code;
		this.b_time = b_time;
		this.b_state = b_state;
		this.b_url = b_url;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_code() {
		return b_code;
	}
	public void setB_code(String b_code) {
		this.b_code = b_code;
	}
	public String getB_time() {
		return b_time;
	}
	public void setB_time(String b_time) {
		this.b_time = b_time;
	}
	public String getB_state() {
		return b_state;
	}
	public void setB_state(String b_state) {
		this.b_state = b_state;
	}
	public String getB_url() {
		return b_url;
	}
	public void setB_url(String b_url) {
		this.b_url = b_url;
	}
	@Override
	public String toString() {
		return "Background [id=" + id + ", b_name=" + b_name + ", b_code=" + b_code + ", b_time=" + b_time
				+ ", b_state=" + b_state + ", b_url=" + b_url + "]";
	}
	
}
