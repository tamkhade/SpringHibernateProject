package com.healthcare.services;

import java.util.List;

import com.healthcare.entities.BankBranchMasterEntity;

public interface BankBranchMasterService {
	/*for save*/
	public long addBankBranch(BankBranchMasterEntity bankBranchMasterEntity);
	
	
	/*for edit*/
	public BankBranchMasterEntity getBankBranchbyId(long bnk_brnch_id);
	
	
	/* for Displaying List*/
	public List<BankBranchMasterEntity> bankBranchMasterEntities();
	
	
	/*for delete*/
	public boolean deleteBankBranch(long bnk_brnch_id);
	
	
	/*for update*/
	public long updateBankBranch(BankBranchMasterEntity bankBranchMasterEntity);
}
