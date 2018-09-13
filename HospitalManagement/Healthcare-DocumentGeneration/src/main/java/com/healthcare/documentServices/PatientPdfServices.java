/*package com.healthcare.documentServices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.entities.PatientMasterEntity;
import com.healthcare.pdf.converter.PatientPdfConverter;
import com.healthcare.pdfpojo.PatientPdfModel;
import com.healthcare.services.PatientServices;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class PatientPdfServices {

	public static Set<PatientPdfModel> patientpdflist( Set<PatientMasterEntity> patientMasterEntities)
	{
		
		Set<PatientPdfModel> patientPdfModellist=PatientPdfConverter.patiententitytoformconverter(patientMasterEntities);	
		HashMap<String, Object> hm = new HashMap<String, Object>();
		JRDataSource ds = new JRBeanCollectionDataSource(patientPdfModellist);
		JasperReport jasperReport;
		JasperPrint jasperPrint;
		InputStream s = null;
		FileOutputStream o=null;
		try {
				
		   s = new FileInputStream(new File("D:/jasper/reception.jrxml"));
			JasperDesign jasperDesign = JRXmlLoader.load(s);
			jasperReport = JasperCompileManager.compileReport(jasperDesign);
			jasperPrint = JasperFillManager.fillReport(jasperReport, hm, ds);
			o=new FileOutputStream(new File("D:/jasper/n111.pdf"));
			JasperExportManager.exportReportToPdfStream(jasperPrint, o);
		
		} catch (JRException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		
		return patientPdfModellist;
		
	}

}
*/