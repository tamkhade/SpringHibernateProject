package com.healthcare.controllers;

import java.util.ArrayList;
import java.util.List;

import com.healthcare.services.PatientServices;

public class DataCache {
    
	//@Autowired
	//PatientServices patientServices = new PatientServicesImpl();
	
   /* static StringBuilder dataCache;
    static String [] data;
    static{
	
	dataCache = new StringBuilder();
	dataCache.append("Aaron Hank,Abagnale Frank,Abbey Edward,Abel Reuben,Abelson Hal,"
		+ "Abourezk James,Abrams Creighton,Ace Jane,Ba Jin,Baba Meher,Baba Tupeni,"
		+ "Babbage Charles,Babbitt Milton,Bacevich Andrew,Bach Richard,Bachelard Gaston,"
		+ "Bachelot Roselyne,Bacon Francis,Baddiel David,Baden-Powell Sir Robert (B-P),"
		+ "Badiou, Alain,Badnarik, Michael,Cabell James Branch,Caesar Irving,Caesar Julius,"
		+ "Cage John,Cain Peter,Callaghan James,Calvin John,Cameron Julia,Cameron Kirk,"
		+ "Java Honk,Java Honk Test,Java Honk Test Successful,Java Honk Spring MVC,"
		+ "Java Honk autocomplete,Java Honk Spring MVC autocomplete List");
	
	data =dataCache.toString().split(",");
    }*/
    
  /*  public List<String> getName(String name) {

	List<String> returnMatchName = new ArrayList<String>();
	if(null==patientServices){
		System.out.println("patientServices is null");
	}
	List<String> data = patientServices.patientfullname();	
	for (String string : data) {
	    if (string.toUpperCase().indexOf(name.toUpperCase())!= -1) {
		returnMatchName.add(string);
	    }
	}
	
	return returnMatchName;
    }*/

}
