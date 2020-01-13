import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
	  	WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
	  	WebElement radio_buttons = ObjDriver.findElement(By.name("radiooptions"));
	  	boolean status = radio_buttons.isDisplayed();
	  	    System.out.println("radio button is displayed >>"+status);
	  	boolean enabled_status = radio_buttons.isEnabled();
	  	    System.out.println("radio button is enabled >>"+enabled_status);
	  	boolean selected_status = radio_buttons.isSelected();
	  	    System.out.println("radio button is selected >>"+selected_status);
	  	    radio_buttons.click();
	  	boolean selected_status_new = radio_buttons.isSelected();
	  	    System.out.println("radio button is selected >>"+selected_status_new);
	 }

}
