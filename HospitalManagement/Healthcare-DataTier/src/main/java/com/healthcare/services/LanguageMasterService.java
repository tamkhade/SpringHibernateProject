/**
 * 
 */
package com.healthcare.services;

import java.util.List;
import com.healthcare.entities.LanguageMasterEntity;

/**
 * @author PC 2
 *
 */
public interface LanguageMasterService {

	/*for Saving Language*/
	
	public long addLanguage (LanguageMasterEntity languageMasterEntity);
	
    /*for displaying Language list*/
	
	public List <LanguageMasterEntity> languageMasterEntities();
}
