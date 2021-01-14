package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Microsoft_Edge_Legacy_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1-Define variable contains the Path of the IE Driver [ you have to download it first through https://www.selenium.dev/downloads/ ]
		
		String microsoftEdgePath = System.getProperty("user.dir") +"\\Browsers\\MicrosoftWebDriver.exe"; 
//2-Then ba2oloh roo7 geeb el Path
		System.setProperty("webdriver.edge.driver", microsoftEdgePath);
				
		
//3-Create object of IE driver [ from selenium]
		WebDriver driver = new EdgeDriver();
		
//4-Then add method to Manage the browser by creating 3 methods [manage method +manage the window + maximize methods to maximize window]
		driver.manage().window().maximize();
		
//5-Then add method to navigates the website url
		driver.navigate().to("https://www.google.com/");
		
		driver.quit();  // use this if i want to Exit browser directly after opening it
	}

}