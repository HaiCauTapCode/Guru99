package guru99.gittest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
	protected WebDriver driver;

	@Test
	public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String eTitle = "Meet Guru99";
		String aTitle = "";
// launch Firefex and redirect it to the Base URL
		driver.get("http://www.guru99.com/");
//maximises the browser window
		driver.manage().window().maximize();
// get the actual value of the title
		aTitle = driver.getTitle();
		if (aTitle.contentEquals(eTitle)) {
			System.out.print("Test passed");
		} else {
			System.out.print("Test failed");
		}
		driver.close();
	}
}
