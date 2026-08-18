package datastructure.collection.properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx2 {
	public static void main(String[] args) throws Exception {
		// properties 파일 읽어오기
		Properties properties = new Properties();
		// 읽어오려는 property 파일 경로
		String path = PropertiesExample.class.getResource("country.properties").getPath();
	
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String country = properties.getProperty("country");
		String language = properties.getProperty("language");
		
		System.out.println("country : " + country);
		System.out.println("language : " + language);
	}
}
