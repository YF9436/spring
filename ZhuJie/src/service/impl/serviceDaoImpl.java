package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.studentDao;

import service.serviceDao;
@Service("serviceDao")
public class serviceDaoImpl implements serviceDao{
	
	@Autowired
	private studentDao dao;
	
	public studentDao getDao() {
		return dao;
	}


	public void setDao(studentDao dao) {
		this.dao = dao;
	}


	@Override
	public void add() {
		String s = dao.add();
		System.out.println(s);
	}

}
