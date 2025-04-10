package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	//create constuctor of BaseClass
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass()
	{
		//create file object and check file is present in desired location or not
		
		File f= new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigurationLayer\\coper.properties");
	
		//read the file
		
		try {
			FileInputStream fis= new FileInputStream(f);
			
			//create properties class
			
			 prop= new Properties();
			 
			 //load the properties in current class
			 
			 prop.load(fis);	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriversFolder\\chromedriver.exe");
	      driver = new ChromeDriver();
	      
	      String url=prop.getProperty("URL");
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	      driver.manage().deleteAllCookies();
	      driver.get(url);
	
	
	}
	
	
	
	
	
	
	
	
}
