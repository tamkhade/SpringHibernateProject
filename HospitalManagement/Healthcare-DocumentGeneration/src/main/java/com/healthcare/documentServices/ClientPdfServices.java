/**
 * 
 *//*
package com.healthcare.documentServices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.healthcare.entities.ClientDetails;
import com.healthcare.services.ClientService;

import antlr.collections.List;
import client.ClientINt;
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

*//**
 * @author ADMIN
 *
 *//*
public class ClientPdfServices implements ClientINt {
	
	@Autowired
	static
	ClientService clientService;
	
	public void jasper() {
		// TODO Auto-generated method stub
		System.out.println("hiii jasper");
    Set<ClientDetails> lis=clientService.clientlist();
		HashMap<String, Object> hm = new HashMap<String, Object>();
		JRDataSource ds = new JRBeanCollectionDataSource(lis);

		JasperReport jasperReport;
		JasperPrint jasperPrint;
		InputStream s = null;
		FileOutputStream o=null;
		try {
			s = new FileInputStream(new File("C:/jrxml/niku.jrxml"));
			JasperDesign jasperDesign = JRXmlLoader.load(s);
			jasperReport = JasperCompileManager.compileReport(jasperDesign);
			jasperPrint = JasperFillManager.fillReport(jasperReport, hm, ds);
       // String filepath="/Healthcare-DataTier/jrxml/simple7_report.pdf";
			o=new FileOutputStream(new File("C:/jrxml/n111.pdf"));
		//	JasperExportManager.exportReportToPdfFile(jasperPrint, o);
			JasperExportManager.exportReportToPdfStream(jasperPrint, o);
			System.out.println("rushi..ok");
		} catch (JRException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}



	
*/