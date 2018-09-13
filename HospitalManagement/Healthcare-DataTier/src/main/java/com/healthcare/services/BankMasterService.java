package com.healthcare.services;

import java.util.List;

import com.healthcare.entities.BankMasterEntity;

public interface BankMasterService {
	/*for save*/
	public long addBank(BankMasterEntity bankMasterEntity);
	
	/*for delete*/
	public boolean deleteBank(long bnk_id);
	
	/*for displaying list*/
	public List<BankMasterEntity> bankMasterEntities();
	
	/*for edit*/
	public BankMasterEntity getBankById(long bnk_id);
	
	/*for update*/
	public long updateBank(BankMasterEntity bankMasterEntity);

}
