package com.demo.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.springmvc.dao.Daoimpl;
import com.demo.springmvc.entity.UserInfo;


public class Serviceimpl implements Servicedao 
{

	@Autowired
	private Daoimpl daoimpl;
	
	public void add(List<UserInfo> UserInfo) 
	{
		daoimpl.add(UserInfo);
	}
	

}
