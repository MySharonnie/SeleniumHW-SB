import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserAssignment {

    /*
    User Story
- Title: Verify page title and URL of Syntax Projects
- As a user,
- I want to navigate to `https://www.syntaxprojects.com/`
- So that I can verify the page title and URL to ensure I am on the correct site.

Acceptance Criteria:
1. The user should be able to launch a web browser and navigate to the URL `https://www.syntaxprojects.com/`.
2. The user should be able to maximize the browser window
2. The current URL should be printed on the console and match `https://www.syntaxprojects.com/`.
3. The page title retrieved should be printed on the console and match `Syntax - Website to practice Syntax Automation Platform`.
4. The browser should close automatically after retrieving both the URL and title.
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.syntaxprojects.com/");
        String url=driver.getCurrentUrl();
        System.out.println("URL: "+url);
        String title=driver.getTitle();
        System.out.println("Title: "+title);
        //driver.close();

    }

    /*
    couldn't run the program. i kept getting this error:
Secure Connection Failed

An error occurred during a connection to syntaxprojects.com.
SSL received a record that exceeded the maximum permissible length.
     */
}
