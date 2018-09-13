package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.PatientDao;
import com.healthcare.daoImpl.PatientDaoImpl;
import com.healthcare.entities.CasePaperEntity;
import com.healthcare.entities.PatientMasterEntity;
import com.healthcare.services.PatientServices;

public class PatientServicesImpl implements PatientServices {

	@Autowired
	PatientDao patientDao;
	
	
	public long savepatient(PatientMasterEntity patient_master)
	{
		
		Serializable id = (Serializable) patientDao.save(patient_master);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
		
	}
	
	
	public Set<PatientMasterEntity> patientMasterEntitieslist() {
		
		
		
		 List<PatientMasterEntity> patientMasterEntitieslist=patientDao.findAll();
			
			Set<PatientMasterEntity> patientMasterEntitieslist1=new HashSet<PatientMasterEntity>();
			
			
			for(PatientMasterEntity g:patientMasterEntitieslist)
			{
				patientMasterEntitieslist1.add(g);
			}
			
			return 	patientMasterEntitieslist1;

	}




	public PatientMasterEntity patientlist(Long patId) {
		
		PatientMasterEntity entity = patientDao.patientlist(patId);
		Set<CasePaperEntity> casePaper = (Set<CasePaperEntity>) entity.getCasepaperEntity();
		for(CasePaperEntity case1 : casePaper){
			
			System.out.println("Case paper id found is ::::::"+case1.getCase_paper_id());
			
		}
		
		return entity;
	}




	public Long patientupdate(PatientMasterEntity patientMasterEntity) {
	
		System.out.println("Patient master entity for updating is ::"+patientMasterEntity.toString());
		return patientDao.update(patientMasterEntity);
	}




	/*public List<String> patientfullname() {
		System.out.println("patient full name:::");
		
		// TODO Auto-generated method stub
		return patientDao.patientfullname();
	}*/
	
	  public List<String> getName(String name) {

			List<String> returnMatchName = new ArrayList<String>();
			
			List<String> data = patientDao.patientfullname();	
			for (String string : data) {
			    if (string.toUpperCase().indexOf(name.toUpperCase())!= -1) {
				returnMatchName.add(string);
			    }
			}
			
			return returnMatchName;
		    }
	
	
	  public Set<PatientMasterEntity> patientnamelist(String patient_fullname) {
			// TODO Auto-generated method stub
		    System.out.println("patient:::::::"+patient_fullname);
			return patientDao.patientnamelist(patient_fullname);
		}
	  
	
}
