package com.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Validation {
	public static void main(String[] args) throws IOException, ParseException {
		File f= new File("E:\\Users\\pc-com\\eclipse-workspace\\Maven1\\src\\test\\java\\com\\api\\payload\\Payload.json");
		FileReader reader =new FileReader(f);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(reader);
		JSONObject jsonobj =(JSONObject) obj;
		Object object = jsonobj.get("Team");
		String string = object.toString();
        System.out.println("Team:  "	+string);	
		
		
	}

}
