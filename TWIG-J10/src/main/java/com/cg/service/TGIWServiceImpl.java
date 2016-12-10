package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TGIWDao;
@Service
public class TGIWServiceImpl implements TGIWService{
	
	@Autowired
	TGIWDao tgiwDao;

	@Override
	public String getTravelerDetails() {
		// TODO Auto-generated method stub
		return tgiwDao.getTravelerDetails();
	}

}
