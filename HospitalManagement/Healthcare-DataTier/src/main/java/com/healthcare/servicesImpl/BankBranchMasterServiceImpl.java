package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.BankBranchMasterDao;
import com.healthcare.entities.BankBranchMasterEntity;
import com.healthcare.services.BankBranchMasterService;

public class BankBranchMasterServiceImpl implements BankBranchMasterService{

	
	@Autowired
	BankBranchMasterDao bankBranchMasterDao;
	public long addBankBranch(BankBranchMasterEntity bankBranchMasterEntity) {
		Serializable id = (Serializable) bankBranchMasterDao.save(bankBranchMasterEntity);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}

	public BankBranchMasterEntity getBankBranchbyId(long bnk_brnch_id) {
		return bankBranchMasterDao.findById(bnk_brnch_id);
	}

	public List<BankBranchMasterEntity> bankBranchMasterEntities() {
		return bankBranchMasterDao.findAll();
	}

	public boolean deleteBankBranch(long bnk_brnch_id) {
		return bankBranchMasterDao.deletebyId(bnk_brnch_id);
	}

	public long updateBankBranch(BankBranchMasterEntity bankBranchMasterEntity) {
		long result= bankBranchMasterDao.update(bankBranchMasterEntity);
		if(result!=0 || result>0)
		{
			return 1L;
		}
		else
		{
			return 0L;
		}
	}

}
