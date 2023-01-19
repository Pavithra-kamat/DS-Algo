package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//for reading the properties file so that it is easier to call it as a method wherever it is used
//this method is used to load the properties from the properties file
public class ConfigReader {

	private Properties prop;

	public Properties init_prop() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("src/test/java/config/config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

	public long getImplicitlyWait() {
		String implicitlyWait = prop.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the config.properties file.");
	}

	public String uName() {
		String un = prop.getProperty("username");
		if (un != null)
			return un;
		else
			throw new RuntimeException("Username not present in the config.properties file");
	}

	public String pWord() {
		String pw = prop.getProperty("password");
		if (pw != null)
			return pw;
		else
			throw new RuntimeException("Password not present in the config.properties file");
	}

}
