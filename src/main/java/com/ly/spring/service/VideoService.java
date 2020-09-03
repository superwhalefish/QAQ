package com.ly.spring.service;

import java.util.List;

import com.ly.spring.entity.Video;

public interface VideoService {
	List<Video> getVideoAll();

	List<Video> findVideoByCate_code(String cate_code);
}
