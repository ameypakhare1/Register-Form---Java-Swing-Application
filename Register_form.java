package automationtesting.in;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_form {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement first_name = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		first_name.sendKeys("Amey");

		WebElement last_name = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		last_name.sendKeys("Pakhare");

		WebElement address = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
		address.sendKeys("Kamothe, Navi Mumbai 410414");

		WebElement email = driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
		email.sendKeys("amey@gmail.com");

		WebElement phone_number = driver.findElement(By.cssSelector("input[ng-model='Phone']"));
		phone_number.sendKeys("9232323244");

		// file upload
		// driver.findElement(By.cssSelector("input[id='imagesrc']")).sendKeys("/home/student/Pictures/sun.jpg");
		driver.findElement(By.cssSelector("input[id='imagesrc']"))
				.sendKeys("C:/Users/ameyp/Desktop/light.jpg");

		WebElement gender_radio_button_male = driver.findElement(By.cssSelector("input[value='Male']"));
		if (gender_radio_button_male.isDisplayed() && gender_radio_button_male.isEnabled()
				&& !gender_radio_button_male.isSelected());
		gender_radio_button_male.click();

		WebElement hobbies_cricket = driver.findElement(By.cssSelector("input[id='checkbox1']"));

		if (hobbies_cricket.isDisplayed() && hobbies_cricket.isEnabled() && !hobbies_cricket.isSelected()) {
			hobbies_cricket.click();
		}

		WebElement hobbies_hockey = driver.findElement(By.cssSelector("input[id='checkbox3']"));
		if (hobbies_hockey.isDisplayed() && hobbies_hockey.isEnabled() && !hobbies_hockey.isSelected()) {
			hobbies_hockey.click();
		}

		WebElement multiSelect = driver.findElement(By.id("msdd"));

		multiSelect.click();
		
		
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li"));

		//System.out.println("options size: " +options.size());
		for (WebElement option : options) {
			//System.out.println(option.getText());
			if (option.getText().equals("Hindi") || option.getText().equals("English")) {
				option.click();
			}
		}
		driver.findElement(By.xpath("//body")).click();
		
		WebElement skills = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		
		Select select_skills = new Select(skills);
		
		select_skills.selectByVisibleText("SQL");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		
		country.click()	;
		
		WebElement denmark = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]"));
		denmark.click()	;
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		Select select_year = new Select(year);
		select_year.selectByVisibleText("1996");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select select_month = new Select(month);
		select_month.selectByVisibleText("April");
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select select_day = new Select(day);
		select_day.selectByVisibleText("5");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
		password.sendKeys("password2025");
		
		WebElement confirm_password = driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
		confirm_password.sendKeys("password2025");
		
		WebElement submit_button = driver.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
		
		submit_button.click();
		
	}

}
