package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step- browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:" + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step: user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User Enter a text in search box");

	}

	@And("hits enter")
	public void hits_enter() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Enter- hits enter");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step -User is navigated to search results");
	}

}
