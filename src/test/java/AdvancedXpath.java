import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

    /*
    User Story
- Title: Filling Form Using Advanced Xpath Selectors
- As a user,
- I want to navigate to `https://syntaxprojects.com/advanceXpath-homework.php`
- So that I can fill in specific details in the form using advanced Xpath selectors.


Acceptance Criteria
1.The user should enter the names of books in reverse order from least favorite to favorite using advanced Xpath (such as `parent`, `following-sibling`, or `preceding-sibling`).
2. The user should enter the name of their favorite book using advanced Xpath.
3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
4. The form should submit successfully only if all fields are filled out correctly using the appropriate advanced Xpath expressions.(to be removed)

     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        WebElement favorite =driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        favorite.sendKeys("The Man and the Sea");

        WebElement least2 =driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        least2.sendKeys("Moby Dick");

        WebElement least3 =driver.findElement(By.xpath("//input[@id='least-favorite']"));
        least3.sendKeys("A Separate Peace");

        WebElement favorite1=driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favorite1.sendKeys("Mockingjay");

        WebElement favorite2=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favorite2.sendKeys("Catching Fire");

        WebElement favorite3 =driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favorite3.sendKeys("The Hunger Games");

        WebElement grandparent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandparent.sendKeys("Muriel");

        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Denise");

        WebElement child=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Ronnie");









    }
}
