package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader_Adactin {
	public static Properties ph;
	public Config_Reader_Adactin()
			throws IOException {
		
	
	File f= new File("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\src\\main\\java\\com\\testdata\\property\\Adactin.properties");
	FileInputStream fis= new FileInputStream(f);
	 ph = new Properties();
	 ph.load(fis);
	
	}
	
	public String get_adactin_url() {
		String url = ph.getProperty("url");
		return url;
		

	}
	
  public String get_adactin_username() {
  String username = ph.getProperty("username");
  return username;
  
}
  
  public String get_adactin_pass() {
	String password = ph.getProperty("password");
	return password;
	

}
  public String get_adactin_login() {
	String login = ph.getProperty("login");
	return login;

}
}
