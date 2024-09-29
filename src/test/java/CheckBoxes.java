import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    /*
     User Story
-Title: Verifying Checkbox Functionality
- As a user,
- I want to navigate to `https://syntaxprojects.com/basic-checkbox-demo-homework.php`
- So that I can ensure all the checkbox functionality is working as expected.
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        // 1. Subscribe to Newsletter:
        //   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.

        WebElement newsLetter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        if (newsLetter.isEnabled()) {
            newsLetter.click();


            //2.Select Your Hobbies:
            //   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
            //   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.

            List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@class='cb-element']"));
            for (WebElement checkBox : allCheckboxes) {
                String cbValue = checkBox.getAttribute("value");
                if (cbValue.equals("reading") || cbValue.equals("cooking")) {
                    checkBox.click();
                }
            }
        }

        //3. Select Your Interests:
        //   - Verify that the **Support** and **Music** checkboxes are not displayed by default.
        //   - Click on the "Show Checkboxes" button, and then select the **Music** checkbox.

        WebElement supportCB = driver.findElement(By.xpath("//input[@value='Support']"));
        WebElement musicCB = driver.findElement(By.xpath("//input[@value='Music']"));
        WebElement enableButton1 = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        if (!supportCB.isDisplayed() && !musicCB.isDisplayed()) {
            enableButton1.click();

            musicCB.click();
        }

        //4. Preferences:
        //   - Verify that the **Receive Notifications** checkbox is disabled.
        //   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.

        WebElement notifications = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        WebElement enableButton2 = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        if (!notifications.isEnabled()) {
            enableButton2.click();

            notifications.click();
        }


    }
}


