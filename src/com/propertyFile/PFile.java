package com.propertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;
import java.util.Set;

public class PFile {
	public static void main(String[] args) throws IOException{
		File f = new File("vk.properties");
		if(!f.exists())
			f.createNewFile();	
		
		Properties p = new Properties();
//		FileInputStream fis = new FileInputStream(f);
//		p.load(fis);
		p.setProperty("url", "192.89.5");
//		p.setProperty("username", "YADAV002");
//		p.setProperty("password", "YADAV403");
		
//		FileOutputStream fos = new FileOutputStream(f);
//		p.store(fos, "new file");
//		fos.close();
		
		FileInputStream fis = new FileInputStream(f);
		p.load(fis);
		fis.close();
		
//		Set<Object> keys = p.keySet();
//		System.out.println(keys);
//		
//		Collection<Object> val =  p.values();
//		System.out.println(val);
//		
//		System.out.println(p.getProperty("url"));
//		System.out.println(p);
		
	}

}
