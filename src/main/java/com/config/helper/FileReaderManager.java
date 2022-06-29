package com.config.helper;

import java.io.IOException;

public class FileReaderManager {
	
	
	
	private FileReaderManager() {
		
	}
	
	
	public static  FileReaderManager getInstancerFRM() {
		
	
	FileReaderManager frm = new FileReaderManager();
	return frm;
	}
	
	
	public  Configuration_Reader getInstanceCR () throws IOException {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
