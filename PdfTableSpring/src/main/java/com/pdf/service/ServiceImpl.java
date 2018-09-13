package com.pdf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pdf.dao.DaoInterface;
import com.pdf.model.BookStore;

public class ServiceImpl implements serviceInterface {
	@Autowired
	DaoInterface pdfDao;

	public List<BookStore> getList() {
		
		return pdfDao.getList();
		
	}

}
