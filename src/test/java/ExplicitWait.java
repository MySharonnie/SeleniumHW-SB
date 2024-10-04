import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {


        /*User Story
- **Title**: Verifying Synchronization Using Explicit Waits
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/synchronization-explicit-wait-homework.php`
- So that I can ensure the text, button, and checkbox functionalities work as expected using appropriate wait times.
*/

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");

        /*
        1. **Change Text**:
   - Click on the button **"Click me to change text!"**.
   - Wait until the text changes to **"Ssyntaxtechs"**, then print the text **"Ssyntaxtechs"** on the console.
         */

        WebElement changeTextBtn=driver.findElement(By.id("changetext_button"));
        changeTextBtn.click();
        WebElement changedText=driver.findElement(By.xpath("//h2[@id='headingtext']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.id("headingtext"), "Ssyntaxtechs"));
        System.out.println(changedText.getText());

        /*
        2. **Enable Button**:
   - Click on the button **"Click me to enable button"**.
   - Wait for the button to be enabled, and once it's enabled, click on it.
         */

        WebElement enableButton=driver.findElement(By.id("enable_button"));
        enableButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        enableButton.click();

        /*
        3. **Checkbox Checked Based on Click**:
   - Click on the button **"Click me to check the checkbox"**.
   - Wait for the checkbox to be checked, then print the status of **isSelected** on the console to verify if the checkbox is enabled.
         */

        WebElement checkboxBtn=driver.findElement(By.xpath("//button[@id='checkbox_button'] "));
        checkboxBtn.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.id("checkbox")));
        WebElement checkBox=driver.findElement(By.id("checkbox"));
        if(checkBox.isSelected()) {
            System.out.println("The checkbox has been selected");
        } else{
            System.out.println("The checkbox has not be selected");
        }








    }
}
