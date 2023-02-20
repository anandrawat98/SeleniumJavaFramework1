package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test1.TestNg_demo;

public class PropertiesFile {

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}
	//static Properties prop;
	public static void getProperties()
	{
		
		try {
			Properties prop=new Properties();
			InputStream input=new FileInputStream("C:\\Users\\AnandRawat\\eclipse-workspace\\SeleniumJavaFramework\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String b=prop.getProperty("browser");
			System.out.println(b);
			TestNg_demo.browserName=b;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.getStackTrace();
		}
		
	}
	public static void setProperties()
	{
		try {
			Properties prop=new Properties();
			OutputStream output=new FileOutputStream("C:\\Users\\AnandRawat\\eclipse-workspace\\SeleniumJavaFramework\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser","Firefox");
			try {
				prop.store(output,null);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}