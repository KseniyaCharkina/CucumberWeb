package demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepdefsAuth {
    protected WebDriver driver;


    @Given("We have user site OTUS")
    public void weHaveUserWithLoginPassword() {
        System.out.println("User Kseniya Charkina");
    }

    @When("User enters login {string} and password {string}")
    public void userEntersLoginAndPassword(String login, String password) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://otus.ru");
        driver.findElement(By.cssSelector("button.header2__auth")).click();
        driver.findElement(By.cssSelector("div.new-input-line_slim:nth-child(3) > input:nth-child(1)")).sendKeys(login);
        driver.findElement(By.cssSelector(".js-psw-input")).sendKeys(password);
        driver.findElement(By.cssSelector("div.new-input-line_last:nth-child(5) > button:nth-child(1)")).submit();
        if (driver != null) driver.quit();

    }

    @Then("User in personal account")
    public void userInPersonalAccount() {
        System.out.println("User Kseniya Charkina is authorized");
    }
}
