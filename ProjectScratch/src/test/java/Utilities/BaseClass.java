package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constants.constant;

public class BaseClass {
	
	constant cons=new constant();
	
	static WebDriver driver;
	
	public static WebDriver InitializeDriver()
	{
		driver=new ChromeDriver();
		
		try {
			driver.get(GetDataFromExcel.getURL());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void takesscreenshot() 
	{
		TakesScreenshot Srcshot=(TakesScreenshot)(driver);
		File SrcFile=Srcshot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(constant.SCREENSHOTPATH);
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	public static void scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy(0,500)", "");
	}
	
	public void Implicitwaitvalue()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	
	
	

}
