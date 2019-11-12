package assement2;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;


public class TestMe {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void ClickingOnJavaScriptAlertsAndConfirmingThePopUpShouldResultInYouClickedOK() {
    driver.get("https://the-internet.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(1920, 1080));
    driver.findElement(By.linkText("JavaScript Alerts")).click();
    driver.findElement(By.cssSelector("li:nth-child(2) > button")).click();
    assertThat(driver.switchTo().alert().getText(), is("I am a JS Confirm"));
    driver.switchTo().alert().accept();
    assertThat(driver.findElement(By.id("result")).getText(), is("You clicked: Ok"));
    driver.close();
  }
}
