import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    /*
    User Story
- **Title**: Verifying JavaScript Alerts Functionality
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/javascript-alert-box-demo-homework.php`
- So that I can make sure the alerts functionality is working as expected.
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        /*
        1. Birthday Reminder:
   - Click on the "Birthday Reminder" button.
   - When the alert appears, accept the alert.
         */
        WebElement birthdayAlert=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        birthdayAlert.click();
        Alert bdAlert=driver.switchTo().alert();
        Thread.sleep(2000);

        bdAlert.accept();

        /*
        2. Delete Confirmation:
   - Click on the **"Delete File"** button.
   - When the confirmation alert appears, **dismiss** the alert.
   - Print the status of the action (e.g., "File deletion canceled") that appears on the screen, to the console.
         */

        WebElement deleteFile=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        deleteFile.click();
        Thread.sleep(2000);
        Alert delete=driver.switchTo().alert();
        delete.dismiss();

        /*
        3. Name Collection:
   - Click on the **"Enter Your Name"** button.
   - Accept the alert and provide a name.
   - Retrieve the name that appears on the screen UI and print it on the console, verifying that the correct name is displayed.
         */

        WebElement name=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        name.click();
        Alert nameAlert=driver.switchTo().alert();
        String nameEntered="Ronnie";
        nameAlert.sendKeys(nameEntered);
        nameAlert.accept();
        WebElement prompt=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        String nameInput=prompt.getText();
        if(nameInput.contains(nameEntered)){
            System.out.println(nameEntered);
        }
        



        







        }

    }

