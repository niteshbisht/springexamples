package com.selenium.integ;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfig {
  private WebDriver driver;

  public SeleniumConfig() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  static {
    System.setProperty("webdriver.chrome.driver","D:\\tools\\chrome\\chromedriver-win64\\chromedriver.exe");
  }

  public void close() {
    driver.close();
  }

  public void navigateTo(String url) {
    driver.navigate().to(url);
  }

  public void clickElement(WebElement element) {
    element.click();
  }

  public WebDriver getDriver() {
    return driver;
  }

}
