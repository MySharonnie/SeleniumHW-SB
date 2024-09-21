import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

    /*
    User Story : Fill Out Form Using XPath


Given the user navigates to `https://www.syntaxprojects.com/Xpath-homework.php`,
When the user enters the necessary information in the form,
Then all the necessary key points in the acceptance criteria should be met.


### Acceptance Criteria:
1. The user is able to enter their hobbies using XPath.
2. When the user clicks the "Click Here" button using XPath.,
   Then the message `"Button clicked:"` should be displayed on the screen.
3. The user successfully enters their favorite movie using XPath to find the text boxes.
4. The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
5. The user is able to enter the city in the designated field.
6. The user must use the **indexing technique** learned in class to enter  email addresses.
7. The user must use the **operators technique**WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php"); (e.g., `and`, `or`) to enter both the client name and client ID.
8. The user can use **any XPath technique** to enter the street number and house number.
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");


        WebElement hobbies = driver.findElement(By.xpath("//input[@name='yourHobbies']"));
        hobbies.sendKeys("Reading and singing");
        WebElement clickButton= driver.findElement(By.xpath("//button[text()='Click Here']"));
        clickButton.click();
        WebElement movie=driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        movie.sendKeys("That's a very long list");
        WebElement randomElement=driver.findElement(By.xpath("//label[contains(text(),'dolorum')]"));
        System.out.println(randomElement.getText());
        WebElement yourCity=driver.findElement(By.xpath("//input[@name='yourCity']"));
        yourCity.sendKeys("The Shire");
        WebElement personalEmail=driver.findElement(By.xpath("//label[contains(text(),'Personal')]/following-sibling::input[1]"));
        personalEmail.sendKeys("syntaxiscrazy@gmail.com");
        WebElement clientName=driver.findElement(By.xpath("//input[@name='clientName' and @id='clientName']"));
        clientName.sendKeys("Frodo Baggins");
        WebElement clientId=driver.findElement(By.xpath("//input[@name='clientId' and @id='clientId']"));
        clientId.sendKeys("15296-4");
        WebElement streetNo=driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNo.sendKeys("123 Sesame St");
        WebElement houseNo=driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNo.sendKeys("8675309");


    }
}
