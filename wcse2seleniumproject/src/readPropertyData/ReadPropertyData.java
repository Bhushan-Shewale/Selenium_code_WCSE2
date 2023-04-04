package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//TO READ THE PROPERTY DATA
		
		Properties prop = new Properties();
		
		//WE NEED TO USE THIS METHODS
		
		prop.load(fis);
		String data = prop.getProperty("username");//IT IS USED TO READ KEY VALUE FROM PROPERTY FILE
		System.out.println(data);

	}

}
