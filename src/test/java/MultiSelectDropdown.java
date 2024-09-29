import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropdown {

    //User Story
    //- **Title**: Verifying Dropdown and Multi-Select Functionality
    //- **As a user,**
    //- I want to navigate to https://syntaxprojects.com/basic-select-dropdown-demo-homework.php Links to an external site.
    //- So that I can verify that users can select the correct options from both single and multi-select dropdowns.

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        /*
        1. Select List Demo:
   - Use the **Select** class to select the option **"Pear"** from the dropdown.
   - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
   - Use the **getOptions** method to retrieve all options from the dropdown and print them on the console.
         */

        WebElement fruitDropdown = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select sel = new Select(fruitDropdown);
        sel.selectByValue("Pear");
        List<WebElement> options = sel.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }


        /*
        2. Select Multiple Options:
   - First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.
   - Using the **Select** class, make the following selections:
     - **Traveling**
     - **Cooking**
     - **Gardening**
   - Click the **"Get All Selected"** button and print the result on the console.
   - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
   - Click the **"Get All Selected"** button again and print the result on the console.
         */

        WebElement hobbiesDD=driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select s=new Select(hobbiesDD);
        System.out.println("The hobbies dropdown is multi-select (True/False): "+s.isMultiple());
        s.selectByValue("Traveling");
        s.selectByVisibleText("Cooking");
        s.selectByIndex(4);

        WebElement getAll=driver.findElement(By.xpath("//button[@id='get_all']"));
        getAll.click();
        List<WebElement> selected=s.getAllSelectedOptions();
        for(WebElement option: selected){
            System.out.println(option.getText());
        }

        System.out.println("****************");


        s.deselectByIndex(1);
        List<WebElement> selected2=s.getAllSelectedOptions();
        for(WebElement option2: selected2)
        System.out.println(option2.getText());

    }


}

