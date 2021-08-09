package demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepdefsSubscribe {
    protected WebDriver driver;


    @Given("We have user")
    public void weHaveUser() {
        System.out.println("Unknown user");
    }


    @When("User enters mail {string} into the form")
    public void userEntersMailIntoTheForm(String email) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://otus.ru");
        driver.findElement(By.name("email")).sendKeys("yomeb23492@o3live.com");
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Подписаться')]")));
        driver.findElement(By.xpath("//button[contains(text(),'Подписаться')]")).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Вы успешно')]")));

    }

    @Then("User subscribe")
    public void userSubscribe() {
        System.out.println("User subscribe to news site OTUS");
    }


}
