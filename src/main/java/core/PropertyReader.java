package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyReader 
{
	Properties property = new Properties();
	
	public void setProperty(String key, String value) throws IOException
	{
		OutputStream out = new FileOutputStream("src/test/java/resources/data.properties");
		
		property.setProperty(key, value);
		
		property.store(out, null);
	}
	
	public String getProperty(String key) throws IOException
	{
		InputStream input = new FileInputStream("src/test/java/resources/data.properties");
		
		property.load(input);
		
		return property.getProperty(key);
	}
}
