package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class EnvironmentUtils {
	
	public static Properties getConfig() {
		String configPath = System.getProperty("user.dir") + "/Drivers/config.properties";
		Properties config = null;
		try {
			config = new Properties();
			FileInputStream fi = new FileInputStream(configPath);
			config.load(fi);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return config;
	}
}
