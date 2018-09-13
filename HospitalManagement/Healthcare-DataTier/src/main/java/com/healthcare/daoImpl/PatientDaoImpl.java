package com.healthcare.daoImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.healthcare.dao.PatientDao;
import com.healthcare.entities.PatientMasterEntity;
import com.healthcare.utils.AbstractGenericDao;

public class PatientDaoImpl extends AbstractGenericDao<PatientMasterEntity> implements PatientDao{

	public PatientMasterEntity patientlist(Long patId) {

		Session session = getSession();
		session.beginTransaction();
		Query query = session.createQuery("select e from PatientMasterEntity e where e.patient_master_id=:patId");
		query.setParameter("patId", patId);
		@SuppressWarnings("unchecked")
		PatientMasterEntity patientMasterEntity = (PatientMasterEntity) query.uniqueResult();
		
		System.out.println(patientMasterEntity.getPatient_fullname());
		System.out.println(patientMasterEntity.getPatient_fname());
		
		return patientMasterEntity;
	}

	
	public List<String> patientfullname() {
		System.out.println("patient full name");
		Session session = getSession();
		session.beginTransaction();
		Query query = session.createQuery("select e.patient_fullname from PatientMasterEntity e");
		List<String> patNm = (List<String>) query.list();
		
		return patNm;
	}
	
	
	public Set<PatientMasterEntity> patientnamelist(String patient_fullname) {
		// TODO Auto-generated method stub
		
		System.out.println("patient full name:::123"+patient_fullname);
		//Query query = session.createQuery("select e PatientMasterEntity where e from patient_fullname  ");
		
       Criteria criteria = getSession().createCriteria(PatientMasterEntity.class).add(Restrictions.like("patient_fullname",patient_fullname,MatchMode.START));
		List<PatientMasterEntity> list=criteria.list();
		Set<PatientMasterEntity> patientlist=new HashSet<PatientMasterEntity>();
		for(PatientMasterEntity p:list)
		{
			patientlist.add(p);
			System.out.println("hiii mahesh this is:::"+p.getPatient_fullname());
		}
		
		return patientlist;
	}

	

	
}
