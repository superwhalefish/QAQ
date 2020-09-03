package com.ly.spring.service;

import java.util.Map;

import com.ly.spring.entity.Background;

public interface AdminBackgroundService {

	Map<String,Object> getAdminBackground(Integer page,Integer limit,Background background);
}
