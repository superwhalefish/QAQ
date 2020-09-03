package com.ly.spring.service.imp;

import org.springframework.stereotype.Service;

import com.ly.spring.service.LoginService;
import com.ly.spring.utils.ResultMessage;

@Service
public class LoginServiceImp implements LoginService {
	@Override
	public Integer toLogin(String usr, String psw) {
		// TODO Auto-generated method stub
	
		if(ResultMessage.usr.equals(usr)) {
			if(ResultMessage.psw.equals(psw)) {
				return 1;
			}else {
				return 2;
			}
		}
		
		return 0;
	}

}
