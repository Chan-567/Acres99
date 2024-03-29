package step_definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Buyers {
	WebDriver driver = new ChromeDriver();


	@Given("after successful login into the 99Acres website")
	public void after_successful_login_into_the_99acres_website() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		 driver.navigate().to("https://www.99acres.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}

	@When("user selects the for buyer option on website it shows a dropdown")
	public void user_selects_the_for_buyer_option_on_website_it_shows_a_dropdown() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()=\"For Buyers\"]")).click();

	}

	@When("select the property in hyderabad option and clicks unnder construction option")
	public void select_the_property_in_hyderabad_option_and_clicks_unnder_construction_option() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebElement x = driver.findElement(By.xpath("//a[text()=\"Property in Hyderabad\"]"));
		String thisLink = x.getAttribute("href");
		driver.navigate().to(thisLink);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div/div/div[4]")).click();
		driver.findElement(By.xpath("//div[@ data-label='UNDER_CONSTRUCTION_NUDGE']")).click();
		

	}

	@Then("select the divine space 2BHK flat")
	public void select_the_divine_space_2bhk_flat() throws AWTException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("var element = document.elementFromPoint(100, 100);"
//                        + "var event = new MouseEvent('dblclick', { 'view': window, 'bubbles': true, 'cancelable': true });"
//                        + "element.dispatchEvent(event);");
//		Actions actions = new Actions(driver);
//		actions.moveByOffset(100, 100).doubleClick().perform();
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(100); // Delay between clicks
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3000);
        driver.quit();
	}
	

	@When("user selects buyer option then click on Plot and click on East facing option")
	public void user_selects_buyer_option_then_click_on_land_plot_and_click_on_east_facing_option() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()=\"For Buyers\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Land/Plot\"]")).click();
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[2]/div/ul/li/div/ul/li[4]/a"));
		String thisLink = x.getAttribute("href");
		driver.navigate().to(thisLink);
		
	}

	@When("select one Plot")
	public void select_one_plot() throws AWTException, InterruptedException {
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(100); // Delay between clicks
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
        }

	@Then("view the review page")
	public void view_the_review_page() throws AWTException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
//		JavascriptExecutor javascriptExecutor1  = (JavascriptExecutor) driver;
//        javascriptExecutor1.executeScript("window.scrollBy(0,1000)");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(3000);
        driver.quit();

	}


	@When("user selects buyer option then clicks on commercial sale in Hyderabad")
	public void user_selects_buyer_option_then_clicks_on_commercial_sale_in_hyderabad() {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//a[text()=\"For Buyers\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[3]/span")).click();
		WebElement x = driver.findElement(By.xpath("//a[@class='pageComponent' and text()='Commercial property for sale in Hyderabad']"));
		String thisLink = x.getAttribute("href");
		driver.navigate().to(thisLink);
		
	}
	

	@When("clicks on Post property")
	public void clicks_on_post_property() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div[1]/div/div[2]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div[1]/div/div[3]")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
	}

	@Then("it should display details screen")
	public void it_should_display_details_screen() {
		// Write code here that turns the phrase above into concrete actions
	}
	
	//driver.findElement(By.className("iconS_Common_24 icon_menuIcon hmenu__explicitSpriteSize")).click(); -- menu bar click
	//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[6]/div[2]/div[2]/div[4]/div[1]/div/a")).click(); --home loans click
	//driver.findElement(By.xpath("//div[text()="CALCULATE EMI"]")).click();  --clicks on calculate emi


	@When("user clicks on menu bar and clicks on Home loans option")
	public void user_clicks_on_menu_bar_and_clicks_on_home_loans_option() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()=\"For Buyers\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[4]/span")).click(); //insights
		WebElement x = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[4]/div[2]/ul/li/div/ul/li[5]/a")); //home loan
		String thisLink = x.getAttribute("href");
		driver.navigate().to(thisLink);
		Thread.sleep(3000);
	}

	@When("selects the calculate EMI bar")
	public void selects_the_calculate_emi_bar() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();	
		driver.findElement(By.xpath("//div[text()=\"CALCULATE EMI\"]")).click(); 
	}
	
	@Then("send values through {string} from row {int} it should display pie chart")
	public void send_values_through_from_row_it_should_display_pie_chart(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}



	
	



}
