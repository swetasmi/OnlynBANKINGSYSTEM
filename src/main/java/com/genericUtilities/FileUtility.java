package com.genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String fetchdataFromProperty(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path.ppath);
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}

}
