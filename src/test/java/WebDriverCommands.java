import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

    /*
    User Story
- Title: Browser Navigation and Window Management
- As a user,
- I want to open the Chrome browser, navigate between multiple websites, and manage the browser window
- So that I can perform navigation tasks like moving between pages, refreshing, and closing the browser after use.

Acceptance Criteria:
1. The user successfully opens Chrome and maximizes the window using `window().maximize()`.
2. The user navigates to `www.google.com`, and the page title is printed correctly.
3. The user navigates to `https://www.syntaxprojects.com/`, and the page title is printed correctly.
4. The user successfully navigates back to `www.google.com` using `navigate().back()`.
5. The page at `www.google.com` is refreshed using `navigate().refresh()`.
6. The browser closes after completing all the navigation steps.
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Google's page title is: " + title);
        driver.navigate().to("https://www.syntaxprojects.com/");
        String title2 = driver.getTitle();
        System.out.println("Syntax's page title is: " + title2);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();


    }
}
