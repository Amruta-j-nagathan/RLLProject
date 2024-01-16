package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ContactUsPage;

public class ContactUsFormSteps {
	
	
	WebDriver driver = new ChromeDriver();
	ContactUsPage cp = new ContactUsPage(driver);

	@Given("I am on Chilternoak Furniture Homepage")
	public void i_am_on_chilternoak_furniture_homepage() {
		
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.chilternoakfurniture.co.uk/");
	    
	}

	@When("I click on ContactUs link")
	public void i_click_on_contact_us_link() throws InterruptedException {
		Thread.sleep(2000);
		cp.Click_contactUsLink();
	    
	}

	@Then("I will be on ContactUs Page and Capture the title of the page")
	public void i_will_be_on_contact_us_page_and_capture_the_title_of_the_page() {
		
		System.out.println("title of the is page is : "+ driver.getTitle());
	 
	}

	@Then("I entered name as {string} on the page")
	public void i_entered_name_as_on_the_page(String name) throws InterruptedException {
	    cp.Give_Name(name);
	}

	@Then("I entered email id as {string} on the page")
	public void i_entered_email_id_as_on_the_page(String email) throws InterruptedException {
		cp.give_Email(email);
	    
	}

	@Then("I entered phone no as {string} on the page")
	public void i_entered_phone_no_as_on_the_page(String phone) throws InterruptedException {
	    cp.give_Phone(phone);
	}

	@Then("I entered message as {string} on the page")
	public void i_entered_message_as_on_the_page(String message) throws InterruptedException {
		
	    cp.give_Message(message);
	}

	@Then("I click on send button")
	public void i_click_on_send_button() throws InterruptedException {
	  cp.Click_Send();
	  Thread.sleep(9000);
	}

}
