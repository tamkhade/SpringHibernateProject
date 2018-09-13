package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.BankMasterDao;
import com.healthcare.entities.BankMasterEntity;
import com.healthcare.services.BankMasterService;

public class BankMasterServiceImpl implements BankMasterService{

	
	@Autowired
	BankMasterDao bankMasterDao;
	
	public long addBank(BankMasterEntity bankMasterEntity) {
		Serializable id = (Serializable) bankMasterDao.save(bankMasterEntity);
		System.out.println("id==" + id);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}

	public boolean deleteBank(long bnk_id) {
		return bankMasterDao.deletebyId(bnk_id);
	}

	public List<BankMasterEntity> bankMasterEntities() {
		return bankMasterDao.findAll();
	}

	public BankMasterEntity getBankById(long bnk_id) {
		return bankMasterDao.findById(bnk_id);
	}

	public long updateBank(BankMasterEntity bankMasterEntity) {
		long result=bankMasterDao.update(bankMasterEntity);
		if(result!=0L || result>0L)
		{
			return 1L;
		}
		else
		{
			return 0L;
		}
	}

}
