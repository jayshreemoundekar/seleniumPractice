package Day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlecheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		//select the specific checkbox
		
		
		//driver.findElement(By.className("Automation")).click();
		
		//number of checkboxes
		List <WebElement>checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		System.out.println("Total number of checkboxes"+ checkboxes.size());
		
		
		//Selelct all checkboxes
		
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		//second method of selection
		/*for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/
		
		
		//select last  checkboxes
		
		//total number of chekcboxes-number of checkbox want to select
		//2-1
		/*for(int i=1;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		
		//if there are 7 checkboxes in the website then first (total number of checkboxes-number of checkbox wnt to select )
		//7-2=5
		//for(int i=5;i<checkboxes.size();i++)
		//{
			
		//}
		
		
		//if we wnt to select first two checkboxes 
		//for(int i=0;i<3;i++)
		
		//{
			//checkboxes.get(i).click();
		//}
		
		
		Thread.sleep(4000);
		
		for(int i=0; i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
		for(WebElement chkbox:checkboxes)
		{
			if(chkbox.isSelected())
			{
				chkbox.click();
			}
		}
		
		
		
	}

}
