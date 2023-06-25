package stepDefination;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.RepaymentCalcPage;

public class RepaymentCalcDef extends BasePage{
	
	@Given("User is on commbank site")
	public void user_is_on_commbank_site() {
		openUrl();
	}

	@When("User clicks on {string} tab")
	public void user_clicks_on_tab(String string) throws InterruptedException {
		RepaymentCalcPage.clickOnHomeLoansTab(string);
		Thread.sleep(2000);
	}

	@When("User clicks on {string} link")
	public void user_clicks_on_link(String string) throws InterruptedException {
		RepaymentCalcPage.clickOnCalculatorsAndTools(string);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	@When("User clicks on Home loan repayments calculator {string} link")
	public void user_clicks_on_home_loan_repayments_calculator_link(String string) throws InterruptedException {
		//RepaymentCalcPage.scrollDownToCalculateNow();
		RepaymentCalcPage.clickOnCalculateNow(string);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span//a[contains(text(), 'Dismiss')]")).click();
	}

	@When("User enters {string} as Loan Amount")
	public void user_enters_as_loan_amount(String string) throws InterruptedException {
		RepaymentCalcPage.setLoanAmount(string);
		Thread.sleep(2000);
	}

	@When("User enters {string} as term")
	public void user_enters_as_term(String string) throws InterruptedException {
		RepaymentCalcPage.setTerm(string);
		Thread.sleep(2000);
	}

	@When("User selects {string} as repayment type")
	public void user_selects_as_repayment_type(String string) throws InterruptedException {
		RepaymentCalcPage.selectRepaymentType(string);
		Thread.sleep(2000);
	}

	@When("User selects {string} in owner occupied")
	public void user_selects_in_owner_occupied(String string) throws InterruptedException {
		RepaymentCalcPage.selectWithaStandard(string);
		Thread.sleep(2000);
	}

	@When("User clicks on calculate button")
	public void user_clicks_on_calculate_button() throws InterruptedException {
		RepaymentCalcPage.clickOnCalculateButton();
		Thread.sleep(2000);
	}

	@Then("User validate total loan repayment and total interest charged")
	public void user_validate_total_loan_repayment_and_total_interest_charged() {
		RepaymentCalcPage.getTotalLoanRepayments();
		RepaymentCalcPage.getTotalInterestCharged();
	}

	@When("User enters {string} and {string} and {string} and {string} for Home Loan repayment")
	public void user_enters_and_and_and_for_home_loan_repayment(String string, String string2, String string3, String string4) throws InterruptedException {
		RepaymentCalcPage.setLoanAmount(string);
		Thread.sleep(2000);
		RepaymentCalcPage.setTerm(string2);
		Thread.sleep(2000);
		RepaymentCalcPage.selectRepaymentType(string3);
		Thread.sleep(2000);
		RepaymentCalcPage.selectWithaStandard1(string4);
		Thread.sleep(2000);
	}

	@When("User clicks on Input interest rate")
	public void user_clicks_on_input_interest_rate() throws InterruptedException {
		RepaymentCalcPage.clickOnInputInterestRate();
		Thread.sleep(2000);
		RepaymentCalcPage.clearInputInterestRate();
		Thread.sleep(2000);
	}
	
	@When("User enters {string} and {string} and {string} for Home Loan repayment")
	public void user_enters_and_and_for_home_loan_repayment(String string, String string2, String string3) throws InterruptedException {
		RepaymentCalcPage.setLoanAmount(string);
		Thread.sleep(2000);
		RepaymentCalcPage.setTerm(string2);
		Thread.sleep(2000);
		RepaymentCalcPage.selectRepaymentType(string3);
		Thread.sleep(2000);
	}
	
	@When("User enters {string} an interest rate in text field")
	public void user_enters_an_interest_rate_in_text_field(String string) throws InterruptedException {
		RepaymentCalcPage.setInputInterestRate(string);
	}
}
