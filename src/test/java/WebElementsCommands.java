import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

    /*
    User Story
- Title: Completing Actions on Form Using Selenium Commands
- As a user,
- I want to navigate to `https://syntaxprojects.com/selenium_commands_selector-homework.php`
- So that I can complete all the necessary actions mentioned in the acceptance criteria using Selenium commands.
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

         /*1. Retrieve Attribute:
       Retrieve the text "inspect me to view my custom attribute" from the element and print it on the console,
         ensuring the text is correct.
          */

        WebElement txtAttr = driver.findElement(By.xpath("//div[@id='textattr']"));
        String txt = txtAttr.getText();
        System.out.println(txt);




         /*
         2. Meal Preference:
         -Choose the checkbox for the meal preference "Musical Festival," ensuring the checkbox is enabled before clicking on it.
         -Ensure that the option for "Tech Talk" is disabled.
         -Click on "Show More Options" and ensure the "Art Exhibition" option is displayed, then click on it.
          */

        WebElement musicFestBox = driver.findElement(By.xpath("//input[@value='music_festival']"));
        if (musicFestBox.isEnabled()) {
            musicFestBox.click();
        }

        WebElement techTalkBox = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        if (!techTalkBox.isEnabled()) {
            System.out.println("The Tech Talk checkbox is disabled");
        }

        WebElement moreOptionsBtn = driver.findElement(By.xpath("//button[text()='Show More Options'] "));
        moreOptionsBtn.click();
        WebElement artEx = driver.findElement(By.xpath("//input[contains(@value,'art_')]"));
        if (artEx.isDisplayed()) {
            artEx.click();
        }

         /*
           3. Mystery Message:
              - Retrieve the value of the attribute `title` from the element containing the text
              "Hover me to reveal the secret" and print it on the console.
         */

        WebElement secret = driver.findElement(By.xpath("//div[@id='hidden_message']"));
        System.out.println("Value of title attribute: " + secret.getAttribute("title"));

         /*
           4. Option Box:
           -If "Checkbox 1" is enabled, click on it. *Ensure that "Checkbox 2" is disabled.---
          */

        WebElement cb1 = driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        if (cb1.isEnabled()) {
            cb1.click();
        }

        WebElement cb2 = driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        if (!cb2.isEnabled()) {
            System.out.println("Checkbox 2 is disabled");
        }

         /*
         5. Input Field:
         -clear the text in the input box and send the text "here is the custom text entered" using selenium commands.
          */
        WebElement inputField = driver.findElement(By.xpath("//input[@value='Default text for clearing and sending keys.']"));
        inputField.clear();
        inputField.sendKeys("here is the custom text entered");


    }
}

