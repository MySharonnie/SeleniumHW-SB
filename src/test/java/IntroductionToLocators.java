import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToLocators {

    /*
    User Story
- Title:Form Submission Using Locators
- As a user,
- I want to fill out and submit a form on `https://www.syntaxprojects.com/locator-homework.php` using different locators
- So that I can verify that the form is submitted successfully and displays the entered information.

Acceptance Criteria
1. The user should fill the form using any of the locators (`id`, `name`, `tagname`, `linktext`, `partial linktext`).
2. If the email address is not in the correct format (i.e., it doesn't contain an `@` sign), the form should not be submitted, and an error message should be displayed.
3. When the user clicks on the "Click Here" link, a new tab should open in the browser.
4. When the user clicks the "Submit" button, all the entered options should be displayed on the screen.
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");
        WebElement name = driver.findElement(By.id("fullName"));
        name.sendKeys("Pablo Escabar");
        WebElement email = driver.findElement(By.id("yourEmail"));
        email.sendKeys("sharonnnerocks@yahoo.com");
        WebElement client = driver.findElement(By.id("clientNameId"));
        client.sendKeys("Bobby Jones");
        WebElement clientID = driver.findElement(By.id("ClientId"));
        clientID.sendKeys("jones748");
        WebElement feedback = driver.findElement(By.id("ClientfeedbackId"));
        feedback.sendKeys("Syntax is great!");
        WebElement project = driver.findElement(By.name("ProjectName"));
        project.sendKeys("SDET Batch 20");
        WebElement deadline = driver.findElement(By.name("ProjectTime"));
        deadline.sendKeys("12/25/24");
        WebElement address = driver.findElement(By.name("CurrentAddress"));
        address.sendKeys("123 Batch20 Way, Batch20, NY 12202");
        WebElement permanentAddress = driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("123 Batch20 Way, Batch20, NY 12202");
        WebElement clickHere = driver.findElement(By.linkText("Click Here."));
        clickHere.click();
                WebElement submitBtn = driver.findElement(By.name("btn-submit"));
        submitBtn.click();


    }
}
