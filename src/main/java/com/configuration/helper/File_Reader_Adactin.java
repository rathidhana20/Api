package com.configuration.helper;

import java.io.IOException;

public class File_Reader_Adactin {
	private File_Reader_Adactin() {
		
	}
	
	public static File_Reader_Adactin get_instance_adactin_FRM() {
		File_Reader_Adactin FRM= new File_Reader_Adactin();
		return FRM;
		
		
		

	}
	
	public Config_Reader_Adactin get_instance_adactin_CR() throws IOException {
		Config_Reader_Adactin reader= new Config_Reader_Adactin();
     return reader;
     
	}

}
