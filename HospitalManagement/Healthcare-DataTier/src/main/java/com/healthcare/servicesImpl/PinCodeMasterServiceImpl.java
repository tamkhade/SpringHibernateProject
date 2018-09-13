package com.healthcare.servicesImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.dao.PinCodeMasterDao;
import com.healthcare.entities.PincodeMasterEntity;
import com.healthcare.services.PincodeMasterService;

public class PinCodeMasterServiceImpl implements PincodeMasterService {

	@Autowired
	PinCodeMasterDao pinCodeMasterDao;

	public long addPincode(PincodeMasterEntity pincodeMasterEntity) {
		Serializable id = (Serializable) pinCodeMasterDao.save(pincodeMasterEntity);
		System.out.println("service==" + id);
		Long r = (Long) id;
		long longValue = r.longValue();

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}

	public PincodeMasterEntity getPincodebyId(long pincode_id) {
		return pinCodeMasterDao.findById(pincode_id);
	}

	public List<PincodeMasterEntity> pincodeMasterEntities() {
		return pinCodeMasterDao.findAll();
	}

	public boolean deletePincode(long pincode_id) {
		return pinCodeMasterDao.deletebyId(pincode_id);
	}

	public long updatePincode(PincodeMasterEntity pincodeMasterEntity) {
		long longValue = pinCodeMasterDao.update(pincodeMasterEntity);

		if (longValue != 0L || longValue > 0L) {

			return 1L;

		} else {
			return 0L;
		}
	}

	

}
