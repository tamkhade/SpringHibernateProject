package com.healthcare.documentServices;

import java.util.HashMap;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


public class Test {

	public static void main(String[] args) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
	//	 JRDataSource  ds = new JRBeanCollectionDataSource(EmployeeImpl.getEmployee());
		        JasperReport jasperReport;
		        JasperPrint jasperPrint;
		        try {
		            jasperReport = JasperCompileManager.compileReport("jrxml/Employee.jrxml");
		        //    jasperPrint = JasperFillManager.fillReport(jasperReport, hm, ds);
		  //          JasperExportManager.exportReportToPdfFile(jasperPrint, "simple5_report.pdf");
		        } catch (JRException e) {
		            e.printStackTrace();
		        }
		       

	}

}
