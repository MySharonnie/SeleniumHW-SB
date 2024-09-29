import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class DropdownWithoutSelectTag {

    //User Story
    //- Title: Verifying Dropdown Without Select Tag Functionality
    //- **As a user,**
    //- I want to navigate to `https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php`
    //- So that I can ensure that the dropdown works as expected even without a `select` tag.

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        //1. Choose Your Dream Fruit:
        //   - Retrieve all options from the "Choose your Dream Fruit" dropdown.
        //   - Traverse through the list of options, and select **Mango**.
        //   - Ensure that the selection process is done by iterating through the options and not by
        // directly clicking on the option using Xpath or any direct locator to the item.

        WebElement fruitDropdown=driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        fruitDropdown.click();

        List<WebElement> fruitOption=driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        for(WebElement fruit: fruitOption){
            if(fruit.getText().equals("Mango")){
                fruit.click();
            }
        }

        //2. Choose Your Favorite Hobby:
        //   - Retrieve all options from the "Choose your Favorite Hobby" dropdown.
        //   - Traverse through the list and select **Reading**.
        //   - Ensure that the desired option is selected by iterating through the options,
        //   not by directly clicking on it using Xpath or any other direct locator to the item.

        WebElement hobbiesButton=driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        hobbiesButton.click();

        List<WebElement> hobbies=driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for (WebElement option:hobbies){
            if(option.getText().equals("Reading")){
                option.click();
            }
        }





    }






}
