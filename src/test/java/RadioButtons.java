import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    /*
    User Story
- Title: Verifying Radio Button Functionality
- As a user,
- I want to navigate to `https://syntaxprojects.com/basic-radiobutton-demo-homework.php`
- So that I can check if all radio buttons are working as expected.
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        /*
        1. Choose Your Favorite Beverage:
   - Select the Juice radio button from the list of favorite beverages.
         */

        WebElement juice = driver.findElement(By.xpath("//input[@value='Juice'] "));
        juice.click();

        /*
        2. Preferred Working Environment:
   - Retrieve all radio buttons in the Preferred Working Environment section.
   - Traverse through the list of radio buttons in code and select the Hybrid option.
         */

        List<WebElement> environButton = driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement work : environButton) {
            if (work.getAttribute("value").equals("hybrid")) {
                work.click();
            } else {
                continue;
            }
        }

        /*
        3. Choose Your Favorite Season:
   - If the Spring radio button is disabled, click on the "Enable Buttons" button.
   - Ensure that the Spring option is now enabled, then select it.
   - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
   - Verify that the Winter option is displayed after clicking and is available for selection.
         */

        WebElement spring = driver.findElement(By.xpath("//input[@value='spring']"));
        if (!spring.isEnabled()) {
            WebElement enableRadioButton = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
            enableRadioButton.click();
            if (spring.isEnabled()) {
                spring.click();
            }
        }
        WebElement winterBtn = driver.findElement(By.xpath("//input[@value='winter']"));
        WebElement showRadioButtons = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        if (!winterBtn.isDisplayed()) {
            showRadioButtons.click();
            if (winterBtn.isDisplayed()) {
                winterBtn.click();
            }
        }


        /*
        4. Choose Your Favorite Meal:
   - Select the Lunch radio button from the list of favorite meals.
         */

        List<WebElement> faveMeals = driver.findElements(By.xpath("//input[@name='meal']"));
        for (WebElement meal : faveMeals) {
            String mealValue=meal.getAttribute("value");
            if (mealValue.equals("lunch")){
                meal.click();
            }
        }


    }


}
