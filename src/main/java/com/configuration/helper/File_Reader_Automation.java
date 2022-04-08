package com.configuration.helper;

import java.io.IOException;

public class File_Reader_Automation {
	private File_Reader_Automation() {
	
	}
	
	
	public static File_Reader_Automation get_instance_FRM() {
		File_Reader_Automation helper= new File_Reader_Automation();
		return helper;
		
		
	}
	
	
	

	public Config_Reader_Automation get_instance_CR() throws IOException {
		Config_Reader_Automation reader=new Config_Reader_Automation();
		return reader;

	}
}
