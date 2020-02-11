package br.com.rsinet_hub.dataProviders;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ReadProperties {

	private Properties properties;
	private String propertiesFile;
	private final static String propFilePath = "//configs//";
	private final String extentFilePath = "//configs//extent-config.xml";

	public ReadProperties(String propertiesFile) {
		this.propertiesFile = propertiesFile;
	}

	public ReadProperties() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + propFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("mobile.properties not found at " + propFilePath);
		}
	}

	Logger logger = Logger.getLogger("ReadProperties.class");

	public Properties getProperty() {
		Properties properties = new Properties();
		try {
			String configFilePath = System.getProperty("user.dir") + propFilePath + propertiesFile + ".properties";
			properties.load(new FileInputStream(configFilePath));
		} catch (FileNotFoundException e) {
			logger.error(e.toString());
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.toString());
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return properties;
	}
//	public String getReportConfigPath() {
//		String reportConfigPath = properties.getProperty(System.getProperty("user.dir") + "reportConfigPath");
//		if (reportConfigPath != null)
//			return reportConfigPath;
//		else
//			throw new RuntimeException(
//					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
//	}
}
