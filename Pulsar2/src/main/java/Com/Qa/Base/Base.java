package Com.Qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Com.Pulsar2.Util.TestUtil;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;

	public Base() {
	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\sampathkumar\\Pulsar2\\src\\main\\java\\Com\\Pulsar2\\Config\\Config.Properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\sampathkumar\\Selenium\\Softwares\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
			
		}else if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\sampathkumar\\Selenium\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.out.println("Browser filed no value entered in Config.Properties file");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_Timeout, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	}
