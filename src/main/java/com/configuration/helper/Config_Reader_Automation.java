package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader_Automation {
	
	public static Properties p;
	public Config_Reader_Automation() throws IOException {
		
	
	File f = new File("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\src\\main\\java\\com\\testdata\\property\\Automation.properties");
	FileInputStream fis= new FileInputStream(f);
	 p= new Properties();
	 
	p.load(fis);

	}
	public String get_config_url()  {
		
		String url = p.getProperty("url");
		return url;
		
		
	}

	public String get_config_email() {
		String email = p.getProperty("email");
        return email;
        
	}
	
	public String get_config_pass() {
		String pass = p.getProperty("password");
       return pass;
	}
	
	public String get_config_signin() {
	    String signin = p.getProperty("signin");
	    return signin;

	}
	
	
  
}
