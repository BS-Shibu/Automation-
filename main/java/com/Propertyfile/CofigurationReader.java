package com.Propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class CofigurationReader 
{
	public static Properties p;
	public CofigurationReader() throws Throwable {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\main\\java\\com\\Propertyfile\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	public String geturl() {
		String url = p.getProperty("url");
			return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
			return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
			return password;
	}
}
