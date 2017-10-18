package com.tclabs.rp.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tclabs.rp.dao.UploadDao;
import com.tclabs.rp.model.CandidateEntity;

@Repository("uploadDaoImpl")
public class UploadDaoImpl implements UploadDao{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insertCandidate(CandidateEntity candidateEntity) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
		Transaction trx = session.beginTransaction();
		trx.begin();
		session.save(candidateEntity);
		trx.commit();
		session.close();
	}

}
