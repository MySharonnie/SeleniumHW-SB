import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

    /*
    User Story
- Title: Form Submission Using Unique CSS Selectors
- As a user,
- I want to navigate to `https://syntaxprojects.com/cssSelector-homework.php`
- So that I can successfully fill the form using appropriate CSS selectors.


Acceptance Criteria
1. The user should fill in all the text boxes in the form using*CSS selectors that are unique and return only one element (1/1).
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");
        WebElement userID=driver.findElement(By.cssSelector("input#UserID"));
        userID.sendKeys("14523695");
        WebElement userName=driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("SDETRonnie");
        WebElement lecture=driver.findElement(By.cssSelector("input[name*=LectureIntro]"));
        lecture.sendKeys("SDET");

        WebElement feedbackRay =driver.findElement(By.cssSelector("input[id*='FromRay']"));
        feedbackRay.sendKeys("Syntax is hard");

        WebElement feedbackDucky=driver.findElement(By.cssSelector("input[id*='Ducky']"));
        feedbackDucky.sendKeys("Java is rad");
        WebElement clientID =driver.findElement(By.cssSelector("input[name^='Client']"));
        clientID.sendKeys("987654321");
        WebElement email=driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("abc@syntax.com");
        WebElement courseTopic =driver.findElement(By.cssSelector("input[name*='Topic']"));
        courseTopic.sendKeys("SDET");



    }
}
