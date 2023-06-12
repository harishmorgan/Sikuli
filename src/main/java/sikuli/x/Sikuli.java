package sikuli.x;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sikuli {

		public static void main(String[] args) throws FindFailed {
			
			//+Sikuli is an image-based open source tool to automate the GUI and can be used on any platform like Windows/Linux/Mac/Mobile. 

			/* +Sikuli uses a technique called image recognition to identify and control GUI components.

			====================================================
			• Automate using images
			• No API to launch Browser and URL – need to use selenium
			• Can automate flash objects – YouTube video
			• Desktop application automation */
			
			//First we need to download the sikulix maven dependency file
			
			
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.youtube.com/watch?v=hQYRDNl-lGI&ab_channel=Gumbal");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String filepath = "C:\\Users\\bhara\\eclipse-workspace\\SikuliX\\";
			
			//create the object of Screen class
			
			Screen sc = new Screen();
			
			
			//play Icon
			
			Pattern play = new Pattern(filepath+"play.png");
			sc.wait(play,2000);
			sc.doubleClick();
			sc.click();
			
			//pause Icon
			Pattern pause = new Pattern(filepath+"pause.png");
			sc.wait(pause,2000);
			sc.click();
			
			
			//Maximize Icon		
			Pattern settings = new Pattern(filepath+"settings.PNG");
			sc.wait(settings,2000);
			sc.click();
			
			//sound iCON
			
			Pattern sound = new Pattern(filepath+"sound.PNG");
			sc.wait(sound,2000);
			sc.click();
			
		
		}

	}

