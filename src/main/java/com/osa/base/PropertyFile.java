package com.osa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	
	public String readPropertyData(String key) {
		Properties p=new Properties();
		try{
			FileInputStream file=new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/config.properties"));
			p.load(file);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	String value=p.getProperty(key);
	return value;
	}

}