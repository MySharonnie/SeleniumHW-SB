import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarWithNavigation {

    public static void main(String[] args) {

        //### User Story
        //- **Title**: Verifying Dynamic Date Selection in the jQuery Date Picker
        //- **As a user,**
        //- I want to navigate to `https://syntaxprojects.com/jquery-date-picker-demo-homework.php`
        //- So that I can ensure the correct "To" and "From" dates are selected from the calendar.
        //
        //
        //
        //#### Acceptance Criteria
        //
        //1. **Select "From" and "To" Dates**:
        //   - Select the **From** date and the **To** date in the jQuery date picker.
        //   - The code logic should be **dynamic**, meaning it should work with any selected dates without requiring any changes to the core logic.
        //   - The selection should not rely on hard-coded date values and should be adaptable if the date range changes.

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");

        WebElement fromDateField = driver.findElement(By.id("from_date"));
        fromDateField.click();

        String chosenMonth = "January";
        String chosenYear = "2025";
        String chosenDate = "15";
        boolean dateIsChosen = false;

        while (!dateIsChosen) {
            WebElement datePickerMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            String elementMonth = datePickerMonth.getText();
            WebElement datePickerYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String elementYear = datePickerYear.getText();

            if (elementMonth.equals(chosenMonth) && elementYear.equals(chosenYear)) {
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for (WebElement date : allDates) {
                    if (date.getText().equals(chosenDate)) {
                        date.click();
                        dateIsChosen=true;
                        break;
                    }
                }
            } else {
                WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
                nextButton.click();
            }

        }


        WebElement toDateField = driver.findElement(By.id("to_date"));


    }
}
