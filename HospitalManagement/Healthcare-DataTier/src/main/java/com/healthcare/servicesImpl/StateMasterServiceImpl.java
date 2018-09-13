package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.StateMasterDao;
import com.healthcare.entities.StateMasterEntity;
import com.healthcare.services.StateMasterService;

public class StateMasterServiceImpl implements StateMasterService {
	
	@Autowired
	StateMasterDao stateMasterDao;

	/*public List<StateMasterEntity> getServiceListService(long country_id) {
	return stateMasterDao.getStateListDao(country_id);
    }*/
	
	
	public long addState(StateMasterEntity stateMasterEntity) {
		Serializable id = (Serializable) stateMasterDao.save(stateMasterEntity);
		System.out.println("service==" + id);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}

	public void deleteState(String name) {
		 stateMasterDao.deleteState(name);
	}
	
	/*public boolean deleteState(long state_id) {
		return stateMasterDao.deletebyId(state_id);
	}
*/
	public List<StateMasterEntity> stateMasterEntities() {
		return stateMasterDao.findAll();
	}

	public StateMasterEntity getStateById(long state_id) {
		return stateMasterDao.findById(state_id);
	}

	public long updateState(StateMasterEntity stateMasterEntity) {
		long result=stateMasterDao.update(stateMasterEntity);
		if(result!=0L || result>0L)
		{
			return 1L;
		}
		else
		{
		return 0L;
		}
	}

	/*@Override
	public void deleteState(StateMasterEntity StateMasterEntity) {
		stateMasterDao.deleteState(StateMasterEntity);
		
	}*/

	
	

	
}
