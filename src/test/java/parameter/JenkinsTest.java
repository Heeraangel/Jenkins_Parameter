package parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsTest{
	@Test
	public void parameterTest()
	{
		WebDriver driver = null;
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		switch(browser)
		{
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
		}
		driver.get(url);
		driver.quit();
	}
}