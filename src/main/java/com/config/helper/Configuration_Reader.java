package com.config.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public Properties p;
	
	public Configuration_Reader() throws IOException {
		
		
		File f = new File("C:\\Users\\raghu\\eclipse-workspace\\AdactinProject\\src\\main\\java\\com\\config\\properties\\Configurationproperty.properties");
		
		FileInputStream fis= new FileInputStream(f);
		
		 p = new Properties();
		p.load(fis);
		
	}
	
	
	public String getbrowser() {
		
		String browser = p.getProperty("browser");
		return browser;
		
	}
	
	public String geturl() {
		
		String url = p.getProperty("url");
		return url;
		
	}
	
	public String getusername() {
		String username = p.getProperty("username");
		return username;
		
	}
	
	
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getcardnum() {
		String cardnum = p.getProperty("cardnum");
        return cardnum;
	}
	
	public String getcvvnum() {
		String cvvnum = p.getProperty("cvvnum");
		return cvvnum;
		
	}
	

	
	
	
	
	
	
	

}
