import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {

    /*
    User Story
- **Title**: Verifying Window Popup Modal Functionality for Buttons B1 and B2
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/window-popup-modal-demo-homework.php`
- So that I can verify the functionality of Buttons B1 and B2.
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        /*1. Click on Button B1:
   - Ensure that clicking on the **B1** button opens a new window.
   - Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"**.
   */
        String mainPageWH = driver.getWindowHandle();
        WebElement button1 = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        button1.click();
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();
            if (url.equals("https://syntaxprojects.com/b1-page.php")) {
                WebElement b1Heading = driver.findElement(By.xpath("//h2[text()='Welcome to B1! page']"));
                b1Heading.getText();
                if (b1Heading.getText().equals("Welcome to B1 page")) {
                    System.out.println(b1Heading);
                } else {
                    System.out.println("The B1 heading does not match the given text");
                }
                break;
            }
        }

        /*
        2. Click on Button B2:
   - Ensure that clicking on the **B2** button opens a new window.
   - Verify that the text in the window opened by the **B2** button is **"Welcome to B2 page"**.
         */

        driver.switchTo().window(mainPageWH);
        WebElement button2 = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        button2.click();
        Set<String> allHandles2 = driver.getWindowHandles();
        for (String handle2 : allHandles2) {
            driver.switchTo().window(handle2);
            String url = driver.getCurrentUrl();
            if (url.equals("https://syntaxprojects.com/b2-page.php")) {
                WebElement b2Heading = driver.findElement(By.xpath("//h2[text()='Welcome to B2 page']"));
                if (b2Heading.getText().equals("Welcome to B2 page")) {
                    System.out.println("The B2 heading matches the given text");
                } else {
                    System.out.println("The B2 heading does not the given text");
                }
            }
        }


    }
}




