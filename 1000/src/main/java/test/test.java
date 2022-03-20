
package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver","D:\\ParagData\\Devops_Paid_Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		System.out.println("test successful");
		System.out.println("First New Line Added...");
	}

}
