import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrame {

    /*
    User Story
- **Title**: Handling Iframe Interactions for Form Submission
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/handle-iframe-homework.php`
- So that I can enter the username, select a city, and click on the age checkbox while correctly handling iframes.
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        /*
        1. Select Age Checkbox:
   - Select the **Age** checkbox.
         */

        driver.switchTo().frame(1);
        WebElement nested=driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(nested);
        WebElement ageCB=driver.findElement(By.xpath("//input[@value='Option-1']"));
        ageCB.click();

        /*
        2. **Select City**:
   - Select any city from the dropdown.
         */
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement citiesDD=driver.findElement(By.xpath("//select[@id='cities']"));
        Select s=new Select(citiesDD);
        s.selectByIndex(2);

        /*
        3. **Enter Username**:
   -enter your username in the **Username** field.
         */

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement userName=driver.findElement(By.xpath("//input[@placeholder='User Name']"));
        userName.sendKeys("SyntaxBatch20");









    }

}
