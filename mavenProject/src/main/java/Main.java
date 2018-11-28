

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main 
{
	By myacc = By.linkText("My Account");
	
	WebDriver driver;              //points to webpage wer elements is present
	
	
	
	
	public Main(WebDriver driver) {
	
		this.driver = driver;
	}




	public void clickOnMyAcc()   //behavoiur
	{
		driver.findElement(myacc).click();
	}

}
