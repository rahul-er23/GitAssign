package com.rahul.git;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		FileReader fd=new FileReader("D:\\Study Material\\Java\\db.properties");
		Properties p=new Properties();
		p.load(fd);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("pass"));
		
	}

}
