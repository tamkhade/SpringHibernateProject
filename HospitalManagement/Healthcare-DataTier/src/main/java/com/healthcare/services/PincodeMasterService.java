package com.healthcare.services;

import java.util.List;

import com.healthcare.entities.PincodeMasterEntity;

public interface PincodeMasterService {
	
	/*for save*/
	public long addPincode(PincodeMasterEntity pincodeMasterEntity);
	
	
	/*for edit*/
	public PincodeMasterEntity getPincodebyId(long pincode_id);
	
	
	/* for Displaying List*/
	public List<PincodeMasterEntity> pincodeMasterEntities();
	
	
	/*for delete*/
	public boolean deletePincode(long pincode_id);
	
	
	/*for update*/
	public long updatePincode(PincodeMasterEntity pincodeMasterEntity);
}
