/**
 * 
 */
package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.LanguageMasterDao;
import com.healthcare.entities.LanguageMasterEntity;
import com.healthcare.services.LanguageMasterService;

/**
 * @author PC 2
 *
 */
public class LanguageMasterServiceImpl implements LanguageMasterService{

	@Autowired
	LanguageMasterDao languageMasterDao;
	public long addLanguage(LanguageMasterEntity languageMasterEntity) {
		// TODO Auto-generated method stub
		Serializable id = (Serializable) languageMasterDao.save(languageMasterEntity);
		System.out.println("service==" + id);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L; 

		} else {
			return 0L;
		}
	}

	public List<LanguageMasterEntity> languageMasterEntities() {
		// TODO Auto-generated method stub
		return languageMasterDao.findAll();
	}

}
