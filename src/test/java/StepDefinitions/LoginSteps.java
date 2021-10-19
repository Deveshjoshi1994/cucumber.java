package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("USer is on login page");
		// throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User enterd username and password ");

		// throw new io.cucumber.java.PendingException();
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User login started");
		// throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is going into homepage");
		// throw new io.cucumber.java.PendingException();
	}

	@When("user enters user1 and pass1")
	public void user_enters_user1_and_pass1() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User enterd username and password ");
		// throw new io.cucumber.java.PendingException();
	}

	@When("user enters user2 and pass2")
	public void user_enters_user2_and_pass2() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User Entered the user name and pass");
	}

}
