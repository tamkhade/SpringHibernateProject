/*package com.healthcare.pdf.converter;

import java.util.HashSet;
import java.util.Set;

import com.healthcare.entities.PatientMasterEntity;
import com.healthcare.pdfpojo.PatientPdfModel;

public class PatientPdfConverter {

	public static Set<PatientPdfModel>  patiententitytoformconverter(Set<PatientMasterEntity> patientMasterEntities)
	{
		Set<PatientPdfModel> patientPdfModellist=new HashSet<PatientPdfModel>();
		for(PatientMasterEntity p:patientMasterEntities)
		{    PatientPdfModel patientPdfModel=new PatientPdfModel();
			      patientPdfModel.setPatientfname(p.getPatient_fname());
			       patientPdfModel.setPatientmname(p.getPatient_mname());
			       patientPdfModel.setPatientlname(p.getPatient_lname());
			       patientPdfModel.setPatientfullname(p.getPatient_fullname());
			       patientPdfModellist.add(patientPdfModel);
		}
		
		return patientPdfModellist;

	}
		
}
*/